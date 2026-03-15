package Timus.task_2023;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        int steps = 0;
        int currentBox = 1;

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            char firstLetter = name.charAt(0);

            int targetBox;
            if (firstLetter == 'A' || firstLetter == 'P' || firstLetter == 'O' || firstLetter == 'R') {
                targetBox = 1;
            } else if (firstLetter == 'B' || firstLetter == 'M' || firstLetter == 'S') {
                targetBox = 2;
            } else {
                targetBox = 3;
            }

            steps += Math.abs(targetBox - currentBox);
            currentBox = targetBox;
        }

        System.out.println(steps);
        scanner.close();
    }
}
