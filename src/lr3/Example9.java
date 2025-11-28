package lr3;

import java.util.Arrays;
import java.util.Random;

public class Example9 {
    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(10) + 1;
        int [] ints = new int [size];

        for (int i = 0; i < size; i++) {
            ints[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(ints));

        int min = ints[0];
        for (int i = 1; i < size; i++) {
            if (ints[i] < min) {
                min = ints[i];
            }
        }
        System.out.println("Минимальное значение массива: " + min);

        System.out.print("Индекс(ы)  минимального значения: " );
        for (int i = 0; i < size; i++) {
            if (ints[i] == min) {
                System.out.print(i + " ");
            }
        }
    }
}

//9. Напишите программу, в которой создается массив и заполняется случайными числами.
// Массив отображается в консольном окне.
// В этом массиве необходимо определить элемент с минимальным значением.
// В частности, программа должна вывести значение элемента с минимальным значением
// и индекс этого элемента.
// Если элементов с минимальным значением несколько,
// должны быть выведены индексы всех этих элементов.