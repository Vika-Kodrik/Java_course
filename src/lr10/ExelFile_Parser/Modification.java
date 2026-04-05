package lr10.ExelFile_Parser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.openxml4j.exceptions.OLE2NotOfficeXmlFileException;

public class Modification {

    private static final String DEFAULT_FILE_PATH = "src/lr10/ExelFile_Parser/Example_ExelBook.xlsx";
    private static final String DEFAULT_SHEET_NAME = "Товары";

    public static void main(String[] args) {
        boolean success = false;

        while (!success) {
            try {
                // Запрашиваем путь к файлу у пользователя
                String filePath = getUserInput("Введите путь к Excel файлу (или нажмите Enter для использования по умолчанию):",
                        DEFAULT_FILE_PATH);

                // Запрашиваем имя листа
                String sheetName = getUserInput("Введите имя листа (или нажмите Enter для использования по умолчанию):",
                        DEFAULT_SHEET_NAME);

                // Выполняем парсинг файла
                parseExcelFile(filePath, sheetName);
                success = true; // Если дошли сюда - всё успешно

            } catch (FileNotFoundException e) {
                System.err.println("\n ОШИБКА: Файл не найден!");
                System.err.println("   ➜ Проверьте правильность пути к файлу");
                System.err.println("   ➜ Убедитесь, что файл существует по указанному пути");
                System.err.println("   ➜ Детали: " + e.getMessage());
                System.err.println("\n   Рекомендация: Укажите полный абсолютный путь к файлу\n");

            } catch (OLE2NotOfficeXmlFileException e) {
                System.err.println("\n ОШИБКА: Неверный формат файла!");
                System.err.println("   ➜ Программа поддерживает только файлы .xlsx");
                System.err.println("   ➜ Вы, возможно, пытаетесь открыть файл .xls");
                System.err.println("   ➜ Детали: " + e.getMessage());
                System.err.println("\n   Рекомендация: Конвертируйте файл в формат .xlsx\n");

            } catch (IllegalArgumentException e) {
                System.err.println("\n ОШИБКА: Лист не найден!");
                System.err.println("   ➜ Лист с именем \"" + getUserInput("", "") + "\" отсутствует в книге");
                System.err.println("   ➜ Детали: " + e.getMessage());
                System.err.println("\n   Рекомендация: Проверьте правильность написания имени листа\n");

            } catch (NullPointerException e) {
                System.err.println("\n ОШИБКА: Не удалось получить лист!");
                System.err.println("   ➜ Возможно, файл поврежден или имеет нестандартную структуру");
                System.err.println("   ➜ Детали: " + e.getMessage());
                System.err.println("\n   Рекомендация: Попробуйте открыть и сохранить файл в Excel перед использованием\n");

            } catch (IOException e) {
                System.err.println("\n ОШИБКА: Проблема при чтении файла!");
                System.err.println("   ➜ Возможно, файл открыт в другой программе или недостаточно прав доступа");
                System.err.println("   ➜ Детали: " + e.getMessage());
                System.err.println("\n   Рекомендация: Закройте файл в других программах и проверьте права доступа\n");

            } catch (Exception e) {
                System.err.println("\n НЕИЗВЕСТНАЯ ОШИБКА: " + e.getClass().getSimpleName());
                System.err.println("   ➜ Сообщение: " + e.getMessage());
                System.err.println("\n   Рекомендация: Обратитесь к разработчику со следующим стектрейсом:");
                e.printStackTrace();
            }
        }

    }

    // Парсит Excel файл и выводит его содержимое

    private static void parseExcelFile(String filePath, String sheetName)
            throws IOException, IllegalArgumentException, NullPointerException {

        try (FileInputStream inputStream = new FileInputStream(filePath)) {

            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = workbook.getSheet(sheetName);

            if (sheet == null) {
                StringBuilder availableSheets = new StringBuilder();
                for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
                    availableSheets.append("   • ").append(workbook.getSheetName(i)).append("\n");
                }
                throw new IllegalArgumentException("Лист не найден. Доступные листы:\n" + availableSheets);
            }

            if (sheet.getPhysicalNumberOfRows() == 0) {
                System.out.println("Лист не содержит строк!\n");
                return;
            }

            int rowCount = 0;
            int cellCount = 0;

            for (Row row : sheet) {
                if (row == null) continue;

                System.out.print("Строка " + (row.getRowNum() + 1) + ": ");

                for (Cell cell : row) {
                    if (cell == null) {
                        System.out.print("[пусто] \t");
                        continue;
                    }

                    String cellValue = getCellValueAsString(cell);
                    System.out.print(cellValue + " \t");
                    cellCount++;
                }
                System.out.println();
                rowCount++;
            }

            System.out.println("   • Обработано строк: " + rowCount);
            System.out.println("   • Обработано ячеек: " + cellCount);

        } catch (IOException e) {
            throw e;
        }
    }


    //Значение ячейки в виде строки
    private static String getCellValueAsString(Cell cell) {
        if (cell == null) return "[null]";

        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    return cell.getDateCellValue().toString();
                } else {
                    double numValue = cell.getNumericCellValue();
                    if (numValue == (long) numValue) {
                        return String.valueOf((long) numValue);
                    } else {
                        return String.valueOf(numValue);
                    }
                }
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            case FORMULA:
                try {
                    return "=" + cell.getCellFormula() + " = " + cell.getNumericCellValue();
                } catch (Exception e) {
                    return "[формула: ошибка вычисления]";
                }
            case BLANK:
                return "[пусто]";
            case ERROR:
                return "[ошибка: " + cell.getErrorCellValue() + "]";
            default:
                return "[неизвестный тип]";
        }
    }

     // Получает ввод пользователя с консоли
    private static String getUserInput(String prompt, String defaultValue) {
        Scanner scanner = new Scanner(System.in);

        if (!prompt.isEmpty()) {
            System.out.println(prompt);
        }

        String input = scanner.nextLine().trim();

        if (input.isEmpty()) {
            System.out.println("Использую значение по умолчанию: " + defaultValue);
            return defaultValue;
        }

        return input;
    }
}
