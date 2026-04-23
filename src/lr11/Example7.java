package lr11;

import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class Example7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите заданное значение: ");
        int value = in.nextInt();

        List<String> strings = List.of("Напишите функцию, которая принимает на вход список строк ",
                "и возвращает новый список, содержащий только те строки, ",
                "которые имеют длину больше заданного значения.");

        List<String> stringsAfter = filterStrings(strings, value);

        for (String s : stringsAfter) {
            System.out.println(s);
        }
    }
    public static List<String> filterStrings (List<String> list, int value) {
        return list.stream()
                .filter(s -> s.length() > value)
                .collect(Collectors.toList());
    }
}
/* 7. Напишите функцию, которая принимает на вход список строк
 и возвращает новый список, содержащий только те строки,
 которые имеют длину больше заданного значения.
 */