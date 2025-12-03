package lr4;

public class Example3 {
    public static void main(String[] args) {
        int height = 5;
        int width = 10;

        int [] [] array = new int [height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                array [i][j] = 2;
            }
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

    }
}

/* 3. Напишите программу, в которой создается двумерный массив,
который выводи прямоугольник из цифр 2; */