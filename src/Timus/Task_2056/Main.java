package Timus.Task_2056;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> array = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            array.add(in.nextInt());
        }
        int sum = array.stream().mapToInt(Integer::intValue).sum();
        double average = (double) sum / n;

        if (array.contains(3)) {
            System.out.println("None");
            return;
        }

        if (average == 5.0) {
            System.out.println("Named");
            return;
        }
        if (average >= 4.5) {
            System.out.println("High");
        } else {
            System.out.println("Common");
        }
    }
}
