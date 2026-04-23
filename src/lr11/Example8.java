package lr11;

import java.util.*;
import java.util.stream.Collectors;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите заданное значение: ");
        int value = in.nextInt();

        Random random = new Random();

        List<Integer> integer = new ArrayList<>();

        System.out.println("\n" + "Список до: " + "\n");

        for(int i = 0; i < 10; i++) {
            integer.add(random.nextInt());
            System.out.println(integer.get(i));
        }

        List<Integer> integerAfter = filterNumbers(integer, value);

        System.out.println("\n" + "Список после: " + "\n");
        for (int i : integerAfter) {
            System.out.println(i);
        }
    }
    public static List<Integer> filterNumbers(List<Integer> list,  int value) {
        return list.stream().filter(x -> x > value).collect(Collectors.toList());
    }
}
/*8. Напишите функцию, которая принимает на вход список целых чисел
и возвращает новый список, содержащий только те числа, которые больше заданного значения.
 */