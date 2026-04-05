package lr10.ExelFile_Parser;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class WriteExelFileExample {
    public static void main(String[] args) {
        // создаем новую книгу Exel
        XSSFWorkbook workbook = new XSSFWorkbook();

        // создаем новый лист в книге
        XSSFSheet sheet = workbook.createSheet("Товары");

        // записываем данные в ячейки
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Товар");
        headerRow.createCell(1).setCellValue("Характеристики");
        headerRow.createCell(2).setCellValue("Стоимость");

        Row dataRow1 = sheet.createRow(1);
        dataRow1.createCell(0).setCellValue("Книга");
        dataRow1.createCell(1).setCellValue("Жанр: Фантастика, Автор: Иванов И.И.");
        dataRow1.createCell(2).setCellValue(500.0);

        Row dataRow2 = sheet.createRow(2);
        dataRow2.createCell(0).setCellValue("Компьютер");
        dataRow2.createCell(1).setCellValue("Процессор: Intel Core i5, Оперативная память: 4096 Мб");
        dataRow2.createCell(2).setCellValue(25000.0);

        // записываем книгу Exel в файл
        String filePath = "src/lr10/ExelFile_Parser/Example_ExelBook.xlsx";
        try (FileOutputStream outputStream =
                     new FileOutputStream("src/lr10/ExelFile_Parser/Example_ExelBook.xlsx")) {
            workbook.write(outputStream);
            System.out.println("Данные записаны в файл: Example_ExelBook.xlsx");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
