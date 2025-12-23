package lr8.task_1.Example3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Main {
    public static void readAllByByte(InputStream in) throws IOException {
        byte[] buff = new byte[5];
        while (true) {
            int count = in.read(buff);
            if (count != -1) {
                System.out.println("количество = " + count + ", buff = "
                        + Arrays.toString(buff) + ", str = " +
                        new String(buff, 0, count, "cp1251"));
                //данные буфера преобразовываются в строку "UTF8"
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        String fileName = "src/lr8/task_1/text.txt";
        InputStream inFile = null; // переменная объявляется до секции try, чтобы не ограничивать область видимости

        try {
            inFile = new FileInputStream(fileName);
            readAllByByte(inFile);
        } catch (IOException e) {
            System.out.println("Ошибка открытия-закрытия файла " + fileName + e); // корректное закрытие потока
        } finally {
            if (inFile != null) {
                try {
                    inFile.close();
                } catch (IOException ignore) {
                    /*NOP*/ //No Operation - ничего не делать
                }
            }
        }
    }
}

/*
Пример 3. Прочитать и вывести на экран информацию из предварительно созданного файла
с использованием буфера в 5 байт.*/
