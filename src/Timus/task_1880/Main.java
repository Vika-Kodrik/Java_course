package Timus.task_1880;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int n1 = in.nextInt();
        int [] array1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            array1[i] = in.nextInt();
        }

        int n2 = in.nextInt();
        int [] array2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            array2[i] = in.nextInt();
        }

        int n3 = in.nextInt();
        int [] array3 = new int[n3];
        for (int i = 0; i < n3; i++) {
            array3[i] = in.nextInt();
        }

        // пересечение
        HashSet<Integer> set1 = new HashSet<>();
        for (int num : array1) {
            set1.add(num);
        }

        HashSet<Integer> set2 = new HashSet<>();
        for (int num : array2) {
            set2.add(num);
        }

        int count = 0;
        for (int num : array3) {
            if (set1.contains(num) && set2.contains(num)) { //проверка числа одновременно в двух множествах
                count++;
            }
        }
        System.out.println(count);

    }
}
