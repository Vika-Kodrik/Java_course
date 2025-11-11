package lr2;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = in.nextInt();

        int result = number % 3;

        if (result == 0) {
            System.out.println("Число делится на три без остатка");
        } else {
            System.out.println("Число не делится на три без остатка");
        }
    }
}
