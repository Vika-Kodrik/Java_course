package Timus.task_1876;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(); // левые тапочки
        int b = in.nextInt(); // правые тапочки

        int case1 = 2 * b + 40;
        int case2 = 2 * a + 39;

        System.out.println(Math.max(case1, case2));
    }
}
