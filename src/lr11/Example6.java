package lr11;

import java.util.*;
import java.util.stream.Collectors;

public class Example6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите заданное число: ");
        int number = in.nextInt();

        List<Integer> integers = new ArrayList<>();
        Random random = new Random();

        System.out.println("\n" +"Список до: " +  "\n");

        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(1000));
            System.out.println(integers.get(i));
        }

        List<Integer> integersResult = filterSpecifiedNumbers(integers, number);

        System.out.println("Отсортированный список: ");
        for (int i : integersResult) {
            System.out.println(i);
        }
    }

    public static List<Integer> filterSpecifiedNumbers(List<Integer> list, int number) {

        return list.stream().filter(x -> x % number == 0).collect(Collectors.toList());
    }
}
/*6. Напишите функцию, которая принимает на вход список целых чисел
и возвращает новый список, содержащий только те числа,
 которые делятся на заданное число без остатка.
 */