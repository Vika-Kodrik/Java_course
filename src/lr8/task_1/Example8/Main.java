package lr8.task_1.Example8;

import java.io.*;
import java.net.URL;


public class Main {
    public static void readAllByByte(Reader in) throws IOException {
        while (true) {
            int oneByte = in.read();    // читает 1 байт
            if (oneByte != -1) {    // признак конца файла
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + " конец ");
                break;
            }
        }
    }

    public static void main(String[] args) {
        try {
            InputStream inFile = new FileInputStream("src/lr8/task_1/text.txt");    // байтовый поток
            Reader rFile = new InputStreamReader(inFile, "cp1251"); // символьный поток, передается «русская» кодировка
            readAllByByte(rFile);
            System.out.print("\n\n\n");
            System.out.print("\n\n\n");
            inFile.close();
            inFile.close();
            rFile.close();

            // С потоком связана интернет-страница
            InputStream inUrl = new URL("https://google.com").openStream(); // байтовый поток
            Reader rUrl = new InputStreamReader(inUrl, "cp1251");    // символьный поток
            readAllByByte(rUrl);
            System.out.print("\n\n\n");
            inUrl.close();
            rUrl.close();

            // С потоком связан массив типа byte
            InputStream inArray = new ByteArrayInputStream(new byte[]{5, 8, 3, 9, 11});
            Reader rArray = new InputStreamReader(inArray, "cp1251"); // символьный поток
            readAllByByte(rArray);
            System.out.print("\n\n\n");
            inArray.close();
            rArray.close();

        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}


// Пример 8. Прочитать и вывести на экран информацию из трех источников:
// файла на диске, интернет-страницы и массива данных типа byte.
// Указать кодировку, поддерживающую кириллицу.
// (Сравнить с работой программы, приведенной в примере 2)