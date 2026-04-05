package Timus.Task_1581;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int [] array =  new int[n];

        for (int i = 0; i < n; i ++) {
            array[i] = scanner.nextInt();
        }
        int count = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i+1]) {
                count++;
            } else {
                System.out.print(count + " " + array[i] + " ");
                count = 1;
            }
        }
        System.out.print(count + " " + array[n - 1]);
    }
}
