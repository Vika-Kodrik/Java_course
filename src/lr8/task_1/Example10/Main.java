package lr8.task_1.Example10;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter out = null;
        try {
            // Создание потоков
            br = new BufferedReader(new InputStreamReader(new FileInputStream("src/lr8/task_1/text.txt"), "cp1251"));
            out = new PrintWriter("src/lr8/task_1/Example10/text.txt", "cp1251");

            // Переписывание информации из одного файла в другой
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + s);
                out.println(s);
            }
        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!!");
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            out.flush();
            out.close();
        }
    }
}

 // Пример 10. Выполнить чтение из одного файла и запись в другой файл с использованием класса PrintWriter.