package lr3;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a,b;
        a = b = 1;

        System.out.println("Количество чисел в последовательности: ");
        int size = in.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();

        a = b = 1; int count = 1;
        while (count <= size) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
            count++;
        }

        System.out.println();

        a = b = 1; count = 1;
        do {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
            count++;
        } while (count <= size);

    }
}




/* 3.	Напишите программу, которая выводит последовательность чисел Фибоначчи.
Первые два числа в этой последовательности равны 1,
а каждое следующее число равно сумме двух предыдущих
(получается последовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее).
Количество чисел в последовательности вводится пользователем.
Предложите версии программы, использующие разные операторы цикла.
 */