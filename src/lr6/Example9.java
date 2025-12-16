package lr6;

import java.util.Random;
import java.util.Arrays;

public class Example9 {
    public static int [] change (int [] array) {
        int [] arrayReverse = new int [array.length];
        for (int i = 0; i < array.length; i++) {
            arrayReverse[i] = array[array.length - 1- i];
        }
        return arrayReverse;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int [] array = new int [random.nextInt(10) + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        int [] arrayReverse = change(array);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayReverse));
    }

}

/*9. Напишите программу со статическим методом,
аргументом которому передается одномерный символьный массив.
В результате вызова метода элементы массива попарно меняются местами:
первый — с последним, второй — с предпоследним и так далее.*/
