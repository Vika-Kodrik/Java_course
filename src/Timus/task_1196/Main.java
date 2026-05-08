package Timus.task_1196;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int count = 0;

        int N = in.nextInt();
        int [] teacherYears = new int [N];

        for (int i = 0; i < N; i++) {
            teacherYears[i] = in.nextInt();
        }
        int M = in.nextInt();
        int [] studentYears = new int [M];

        for (int i = 0; i < M; i++) {
            studentYears[i] = in.nextInt();
        }

        Arrays.sort(studentYears);

        int i = 0; // указатель для teacherYears
        int j = 0; // указатель для studentYears

        while (i < N && j < M) {
            if (teacherYears[i] == studentYears[j]) {
                count++;
                j++; // переходим к следующему году студента
            } else if (teacherYears[i] < studentYears[j]) {
                i++; // год преподавателя меньше, двигаем его
            } else {
                j++; // год студента меньше, двигаем его
            }
        }
        System.out.println(count);
    }
}
