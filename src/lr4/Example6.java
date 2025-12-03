package lr4;

import java.util.Random;

public class Example6 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = 5;
        int b = 5;
        int[][] array = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] = random.nextInt(100);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int rowDelete = random.nextInt(a);
        int colDelete = random.nextInt(b);

        System.out.println("Удалена строка " + (rowDelete + 1));
        System.out.println("Удален столбец " + (colDelete + 1));


        int [][] arrayDelete = new int [a - 1][b - 1];

        int newA = 0;
        for (int i = 0; i < a; i++) {
            if (i == rowDelete)
                continue;
            int newB = 0;
            for (int j = 0; j < b; j++) {
                if (j == colDelete)
                    continue;
                arrayDelete[newA][newB] = array[i][j];
                newB++;
            }
            newA++;
        }

        for (int i = 0; i < a - 1; i++) {
            for (int j = 0; j < b - 1; j++) {
                System.out.print(arrayDelete[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/* 6. Напишите программу, в которой создается и инициализируется двумерный числовой массив.
Затем из этого массива удаляется строка и столбец
(создается новый массив, в котором по сравнению с исходным удалена одна строка и один столбец).
Индекс удаляемой строки и индекс удаляемого столбца определяется с помощью генератора случайных чисел.*/
