package lr8.task_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        String consonants = "бвгджзйклмнпрстфхцчшщ";

        try (BufferedReader in = new BufferedReader(new FileReader("src/lr8/task_3/input_Pushkin.txt"));
             PrintWriter out = new PrintWriter("src/lr8/task_3/output_Pushkin.txt", "UTF-8")) {

            String line;
            int lineNum = 0;
            while ((line = in.readLine()) != null) {
                lineNum++;
                String[] words = line.split("\\s+");
                int count = 0;
                for (String word : words)
                    if (!word.isEmpty() && consonants.contains(Character.toLowerCase(word.charAt(0)) + ""))
                        count++;
                out.println(lineNum + ": " + count + " слов(а)");
            }
        }
        System.out.println("Готово! Проверьте файл output_Pushkin.txt");
    }

}
