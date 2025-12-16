package lr6;

import java.util.Arrays;
import java.util.Random;

public class Example10 {
    public static int [] MinAndMax (int ... n) {
        Arrays.sort(n);

        int[] array = new int[2];
        array[0] = n[0];
        array[1] = n[n.length - 1];

        return array;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int count = random.nextInt(10) + 1;
        int[] randomNumbers = new int[count];
        for (int i = 0; i < count; i++) {
            randomNumbers[i] = random.nextInt(201) - 100; // от -100 до 100
        }
        int [] array = MinAndMax(randomNumbers);

        System.out.println("Сгенерированные числа: " + Arrays.toString(randomNumbers));
        System.out.println("Минимальное и максимальное числа: " + Arrays.toString(array));

    }
}

/*
10.	Напишите программу со статическим методом,
аргументом которому передается произвольное количество целочисленных аргументов.
Результатом метод возвращает массив из двух элементов:
это значения наибольшего и наименьшего значений среди аргументов, переданных методу.*/
