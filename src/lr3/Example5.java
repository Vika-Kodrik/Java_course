package lr3;

import java.util.Random;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество чисел: ");
        int size = in.nextInt();

        Random random = new Random();
        int[] ints = new int[size];
        int sum = 0;


        for (int i = 0; i < size; i++) {
            int x;
            do {
                x = random.nextInt(100);
            } while (!(x % 5 == 2 || x % 3 == 1));

            ints[i] = x;
            System.out.print(x + " ");
            sum += x;
        }
        System.out.print("Сумма: " + sum);

        System.out.println();

        int i = 0;
        sum = 0;

        while (i < size) {
            int x;
            do {
                x = random.nextInt(100);
            } while (!(x % 5 == 2 || x % 3 == 1));

            ints[i] = x;
            System.out.print(x + " ");
            sum += x;
            i++;
        }
        System.out.print("Сумма: " + sum);

        System.out.println();

        i = 0;
        sum = 0;

        do {
            int x;
            do {
                x = random.nextInt(100);
            } while (!(x % 5 == 2 || x % 3 == 1));

            ints[i] = x;
            System.out.print(x + " ");
            sum += x;
            i++;
        } while (i < size);
        System.out.print("Сумма: " + sum);
    }
}



/* 5.	Напишите программу, в которой вычисляется сумма чисел, удовлетворяющих таким критериям:
при делении числа на 5 в остатке получается 2, или при делении на 3 в остатке получается 1.
Количество чисел в сумме вводится пользователем.
Программа отображает числа, которые суммируются, и значение суммы.
Предложите версии программы, использующие разные операторы цикла.*/