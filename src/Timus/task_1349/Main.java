package Timus.task_1349;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n == 0) {
            System.out.println(-1);
            return;
        }

        // n = 1, то a + b = c, c <= 100, a,b >=1
        if (n == 1) {
            for (int a = 1; a <= 100; a++) {
                for (int b = a + 1; b <= 100; b++) {
                    int c = a + b;
                    if (c <= 100) {
                        System.out.println(a + " " + b + " " + c);
                        return;
                    }
                }
            }
            System.out.println(-1);
            return;
        }

        // n = 2: пифагоровы тройки (a < b < c)
        if (n == 2) {
            for (int a = 1; a <= 100; a++) {
                for (int b = a + 1; b <= 100; b++) {
                    int cSquare = a * a + b * b;
                    int c = (int) Math.sqrt(cSquare);
                    if (c * c == cSquare && c <= 100) {
                        System.out.println(a + " " + b + " " + c);
                        return;
                    }
                }
            }
            System.out.println(-1);
            return;
        }

        // n > 2: решений нет
        System.out.println(-1);
    }
}