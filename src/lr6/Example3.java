package lr6;

import java.util.Random;

public class Example3 {
    public static int max(int [] numbers) {
        int max = numbers[0];
        for (int n : numbers) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    public static int min(int [] numbers) {
        int min = numbers[0];
        for (int n : numbers) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }

    public static double avarage(int [] numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        Random random = new Random();

        int [] array = new int [random.nextInt(10) + 1];

        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Максимальное значение массив: " + max(array));
        System.out.println("Минимальное значение массив: " + min(array));
        System.out.println("Среднее арифметическое значение массив: " + avarage(array));

    }
}


/*
3.	Напишите программу с классом, в котором есть статические методы,
которым можно передавать произвольное количество целочисленных аргументов
(или целочисленный массив).
Методы, на основании переданных аргументов или массива, позволяют вычислить:
наибольшее значение,
наименьшее значение,
а также среднее значение из набора чисел.*/
