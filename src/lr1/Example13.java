package lr1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int first = in.nextInt();

        System.out.println("Введите число: ");
        int second = in.nextInt();

        System.out.println("Сумма чисел равна " + (first + second));
        in.close();

    }
}
