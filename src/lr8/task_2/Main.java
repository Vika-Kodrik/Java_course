package lr8.task_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("src/lr8/task_2/input.txt"));
        PrintWriter out = new PrintWriter("src/lr8/task_2/output.txt", "UTF-8");

        String line;
        int n = 0;
        while ((line = in.readLine()) != null) {
            n++;
            if (n == 2) out.println(line);
            if (n >= 3 && n <= 7) {
                try {
                    if (Double.parseDouble(line) > 0) out.println(line);
                } catch (Exception e) {}
            }
        }

        in.close();
        out.close();
        System.out.println("Готово! Проверьте файл output.txt");
    }
}
//Задание 2. Создать проект, позволяющий из одного,
// предварительно созданного программными средствами файла,
// переписать данные, соответствующие условию -
// в исходном файле содержится две строки в формате UTF-8 и 5 чисел типа double.
// В результирующий файл переписать вторую строку и положительные числа.