package Timus.task_1910;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] array = new int [n];
        int result = 0;
        int middle = 0;



        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            array[i] = x;
        }
        for (int i = 0; i < n - 2; i++) {
            int sum = array[i] + array[ i+ 1] + array[i + 2];
            if (sum > result) {
                result = sum;
                middle = i + 2;
            }
        }
        System.out.println(result + " " + middle);
    }
}
