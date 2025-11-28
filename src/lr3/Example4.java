package lr3;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int numb1 = in.nextInt();
        System.out.println("Введите второе число: ");
        int numb2 = in.nextInt();

        int min = Math.min(numb1, numb2);
        int max= Math.max(numb1, numb2);

        for (int i = min; i <= max; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        int i = min;
        while (i <= max) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        i = min;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= max);
    }
}



/* 4. Напишите программу, в которой пользователем вводится два целых числа.
Программа выводит все целые числа — начиная с наименьшего (из двух введенных чисел)
и заканчивая наибольшим (из двух введенных чисел).
Предложите разные версии программы (с использованием разных операторов цикла). */