package Timus.task_1991;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // армия поделена на n блоков
        int k = in.nextInt(); // количество дроидов в каждом
        int count_bum = 0;
        int count_droids = 0;

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            if (a <= k) {
                count_droids += k - a;
            } else {
                count_bum += a - k;
            }
        }
        System.out.println(count_bum + " " + count_droids);
    }
}
