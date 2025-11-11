package lr2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = in.nextInt();

        if (number % 4 == 0 && number >= 10) {
        System.out.println("Число соответствует условиям");
    } else {
        System.out.println("Число не соответствует условиям");
        }
    }
}
