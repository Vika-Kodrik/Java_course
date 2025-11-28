package Timus.task_2012;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int f = in.nextInt();


        if (1 + ((12 - f) * 0.75) <= 5) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
