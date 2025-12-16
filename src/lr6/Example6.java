package lr6;

import java.util.Arrays;
import java.util.Random;

public class Example6 {
    public static int [] arrayAndNumber (int n, int [] array) {
        if (n <= array.length) {
            return Arrays.copyOf(array, n);
        } else {
            return Arrays.copyOf(array, array.length);
            }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(11) + 1;
        int [] array = new int [random.nextInt(10) + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        int [] doubleArray = arrayAndNumber(n, array);

        System.out.println("Начальный массив: " + Arrays.toString(array));
        System.out.println("Количество элементов, которые нужно взять: " + n);
        System.out.println("Полученный массив: " + Arrays.toString(doubleArray));

    }
}

/*
Напишите программу со статическим методом,
которому аргументом передается целочисленный массив и целое число.
Результатом метод возвращает ссылку на новый массив,
который получается из исходного массива (переданного первым аргументом методу),
если в нем взять несколько начальных элементов.
Количество элементов, которые нужно взять из исходного массива,
определяются вторым аргументом метода.
Если второй аргумент метода больше длины массива,
переданного первым аргументом,
то методом создается копия исходного массива и возвращается ссылка на эту копию.*/
