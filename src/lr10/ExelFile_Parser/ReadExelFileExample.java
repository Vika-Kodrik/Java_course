package lr10.ExelFile_Parser;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class ReadExelFileExample {
    public static void main(String[] args) {
        // открываем Exel файл для чтения
        try (FileInputStream inputStream =
                     new FileInputStream("src/lr10/ExelFile_Parser/Example_ExelBook.xlsx")) {

            // создаем экземпляр книги Exel из файла
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

            // получаем лист из книги по его имени
            XSSFSheet sheet = workbook.getSheet("Товары");

            // перебираем строки и ячейки листа
            for (Row row : sheet) {
                for (Cell cell : row) {
                    // выводим значение ячейки на консоль
                    System.out.println(cell.toString() + "\t");
                }
                System.out.println();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
