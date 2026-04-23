package Timus.Task_1263;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();//число кандидатов

        int M = in.nextInt(); // число избирателей

        int [] votes = new int [N + 1];

        for (int i = 0; i < M; i++) {
            int number = in.nextInt();
            votes[number]++;
        }
        for (int i = 1; i <= N; i++) {
            double percent = (double) votes[i] * 100 / M;
                System.out.printf("%.2f%%\n", percent);
        }
    }
}
