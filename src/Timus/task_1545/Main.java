package Timus.task_1545;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner in = new Scanner (System.in);
        int N = in.nextInt();
        in.nextLine();
        String [] referenceBook = new String[N];

        for (int i = 0; i < N; i++) {
            referenceBook [i] = in.nextLine();
        }
        String letter = in.nextLine();

        for (int i = 0; i < N; i++) {
            if (referenceBook[i].charAt(0) == letter.charAt(0)) {
                System.out.println(referenceBook [i]);
            }
        }
    }
}

