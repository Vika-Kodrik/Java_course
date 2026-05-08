package Timus.task_1110;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int N = in.nextInt();
        int M = in.nextInt();
        int Y = in.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int X = 0; X <= (M - 1); X++) {
            if (powMod(X, N, M) == Y) {
                list.add(X);
            }
        }
        if (list.isEmpty()) {
            System.out.println(-1);
        }
        for (int X : list) {
            System.out.print(X + " ");
        }
    }
    private static int powMod(int base, int exp, int mod) {
        long result = 1;
        long b = base % mod;
        long e = exp;

        while (e > 0) {
            if (e % 2 == 1) {
                result = (result * b) % mod;
            }
            b = (b * b) % mod;
            e = e / 2;
        }

        return (int) result;
    }
}

