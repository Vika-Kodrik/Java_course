package Timus.Task_1493;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num = in.nextLine();
        int[] digits = new int[6];
        for (int i = 0; i < 6; i++) {
            digits[i] = num.charAt(i) - '0';
        }

        int sum1 = digits[0] + digits[1] + digits[2];
        int sum2 = digits[3] + digits[4] + digits[5];

        boolean nextHappy = false;
        if (digits[5] < 9) {
            nextHappy = (sum1 == sum2 + 1);
        } else {
            // перенос
            int newSum2 = (digits[3] + digits[4] + 1);
            if (digits[4] == 9) {
                newSum2 = digits[3] + 1;
            }
            nextHappy = (sum1 == newSum2);
        }

        boolean prevHappy = false;
        if (digits[5] > 0) {
            prevHappy = (sum1 == sum2 - 1);
        } else {
            // заём
            int newSum2 = (digits[3] + digits[4] - 1 + 9);
            if (digits[4] == 0) {
                newSum2 = digits[3] +9 + 9;
            }
            prevHappy = (sum1 == newSum2);
        }

        if (nextHappy || prevHappy) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
