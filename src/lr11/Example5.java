package lr11;

import java.util.List;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {
        String text = "Напишите функцию, которая принимает на вход список строк" +
                "и возвращает новый список, содержащий только те строки, " +
                "которые содержат заданную подстроку.";

        String str = "строк";
        List<String> strings = List.of(text.split("[\\s,.;:!?]"));

        List<String> stringsAfter = filterStrings(strings, str);

        for (String s : stringsAfter) {
            System.out.println(s);
        }
    }
    public static List<String> filterStrings (List<String> list, String str) {
        return list.stream()
                .filter(s -> s.contains(str))
                .collect(Collectors.toList());
    }
}
/* 5. Напишите функцию, которая принимает на вход список строк
и возвращает новый список, содержащий только те строки,
которые содержат заданную подстроку.
 */