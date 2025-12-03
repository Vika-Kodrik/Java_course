package Timus.task_2001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a1, a2, a3, b1, b2, b3;
        Scanner in = new Scanner(System.in);
        a1 = in.nextInt();
        b1 = in.nextInt();
        a2 = in.nextInt();
        b2 = in.nextInt();
        a3 = in.nextInt();
        b3 = in.nextInt();

        int berries2 = b1 - b2;
        int berries1 =b3 - berries2 - b2;

        System.out.print(berries1 + " " + berries2);

    }
}
