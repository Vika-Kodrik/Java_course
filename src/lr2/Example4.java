package lr2;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = in.nextInt();

        if (number >= 5 && number <= 10) {
            System.out.println("Число " + number + " попадает в диапазон от 5 до 10 включительно.");
        } else {
            System.out.println("Число " + number + " не попадает в диапазон от 5 до 10 включительно.");
        }
    }
}
