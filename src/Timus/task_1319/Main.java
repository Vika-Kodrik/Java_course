package Timus.task_1319;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        int num = 1;

        // Заполнение матрицы по диагоналям, где c - r = const
        // k изменяется от n-1 до -(n-1)
        for (int k = n - 1; k >= -n + 1; k--) {
            for (int r = 0; r < n; r++) {
                int c = k + r;
                if (c >= 0 && c < n) {
                    grid[r][c] = num++;
                }
            }
        }

        // Вывод таблицы
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + (j == n - 1 ? "" : "\t"));
            }
            System.out.println();
        }
    }
}
