package lr8.task_1.Example6;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {//метод main генерирует исключение
        Reader in = null;        // можно сразу записать FileReader in=null;
        Writer out = null;    // можно сразу записать FileWriter out =null;

        try {
            in = new FileReader("src/lr8/task_1/text.txt"); // файл для чтения
            out = new FileWriter("src/lr8/task_1/Example6/text.txt", true); // файл для записи
            // Данные считываются и записываются побайтно, как и для InputStream/OutputStream
            int oneByte;    // переменная, в которую считываются данные
            while ((oneByte = in.read()) != -1) {
                out.write((char) oneByte); // запись с уничтожением ранее существующих данных
                // out.append((char) oneByte); // запись с добавлением данных в конец
                System.out.print((char) oneByte);
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!! ");
        } finally {
            in.close();
            out.close();
        }
    }
}
// Пример 6. Чтение из одного файла и запись в другой файл данных посимвольно.

