package lr4;

public class Example4 {
    public static void main(String[] args) {
        int height = 5;

        char [] [] array = new char [height][height];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                array[i][j] = '*';
            }
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}

/* 4. Напишите программу,в которой создается двумерный массив,
 который выводит прямоугольный треугольник;*/
