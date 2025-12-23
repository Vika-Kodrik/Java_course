package lr8.task_1.Example7;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter out = null;

        try {
        // создание файловых символьных потоков для чтения и записи
            br = new BufferedReader(new FileReader("src/lr8/task_1/text.txt"), 1024); // 1024 - размер буфера
            out = new BufferedWriter(new FileWriter("src/lr8/task_1/Example7/text.txt"));

            int lineCount = 0; //счетчик строк
            String s;
            // переписывание информации из одного файла в другой
            while ((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ":" + s);
                out.write(s);
                out.newLine(); // переход на новую строку
            }
        } catch (IOException e) {
            System.out.println("Ошибка!");
        }
        finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}

// Пример 7. Чтение из одного файла и запись в другой файл данных построчно
// с использованием буфера в 1 килобайт.