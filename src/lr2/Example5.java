package lr2;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = in.nextInt();

        System.out.println("В числе " + number + " " + (number / 1000) + " тысяч(а/и)");
    }
}
