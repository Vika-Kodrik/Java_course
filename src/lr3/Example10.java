package lr3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;


public class Example10 {
    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(10) + 1;
        Integer[] ints = new Integer[size];

        for (int i = 0; i < size; i++) {
            int x = random.nextInt(100);
            ints[i] = x;
        }
        Arrays.sort(ints,Collections.reverseOrder());

        System.out.println(Arrays.toString(ints));
    }
}


// 10.	Напишите программу, в которой создается целочисленный массив,
// заполняется случайными числами и после этого значения элементов в массиве
// сортируются в порядке убывания значений.