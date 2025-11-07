package lr1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите Ваше имя: ");
        String name = in.nextLine();

        System.out.println("Введите Ваш год рождения: ");
        int year = in.nextInt();

        System.out.println(name + ", Вам " + (2025 - year) + " лет.");
        in.close();
    }
}

