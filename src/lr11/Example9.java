package lr11;

import java.util.List;
import java.util.stream.Collectors;

public class Example9 {
    public static void main(String[] args) {

        List<String> strings = List.of("Напишите",
                "функцию," ,
                "которая принимает на вход список строк",
                " и возвращает новый список, содержащий только те строки",
                " которые содержат только буквы (без цифр 0 - 9 и символов).");

        List<String> stringsAfter = filterStrings(strings);

        for (String s : stringsAfter) {
            System.out.println(s);
        }
    }
    public static List<String> filterStrings ( List<String> list) {
        return list.stream()
                .filter(s -> s.matches("^[\\p{L}]+$"))
                .collect(Collectors.toList());
    }
}
/* 9. Напишите функцию, которая принимает на вход список строк
 и возвращает новый список, содержащий только те строки,
 которые содержат только буквы (без цифр и символов).
 */