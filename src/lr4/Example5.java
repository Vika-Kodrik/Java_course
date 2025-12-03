package lr4;

import java.util.Random;

public class Example5 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = 3;
        int b = 5;
        int[][] array = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] = random.nextInt(100);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        int [][] transposed = new int [b][a];

        for (int i = 0; i < a; i ++) {
            for (int j = 0; j < b; j++) {
                transposed[j][i] = array [i][j];
            }
        }

        for (int i = 0; i < b; i++) {  // b строк в transposed
            for (int j = 0; j < a; j++) {  // a столбцов в transposed
                System.out.print(transposed[i][j] + " ");  // i,j для строк
            }
            System.out.println();
        }
    }
}
/* 5. Напишите программу, в которой создается двумерный целочисленный массив.
 Он заполняется случайными числами.
 Затем в этом массиве строки и столбцы меняются местами:
 первая строка становится первым столбцом,
 вторая строка становиться вторым столбцом и так далее.
 Например, если исходный массив состоял из 3 строк и 5 столбцов,
 то в итоге получаем массив из 5 строк и 3 столбцов.*/
