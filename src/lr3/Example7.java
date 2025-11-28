package lr3;

import java.util.Arrays;

public class Example7 {
    public static void main(String[] args) {
        int size = 10;
        char [] ints = new char [size];

        for (int i = 0; i < size; i++) {
            ints[i] = (char) ('a' + i * 2);
        }
        System.out.print(Arrays.toString(ints));
        System.out.println();

        for (int i = 0; i < size / 2; i++) {
            char temp = ints[i];
            ints[i] = ints[size - 1 - i];
            ints[size - 1 - i] = temp;
        }
        System.out.print(Arrays.toString(ints));
    }
}

//7. Напишите программу, в которой создается одномерный символьный массив из 10 элементов.
// Массив заполняется буквами «через одну», начиная с буквы 'а':
// то есть массив заполняется буквами 'а', 'с', 'е', 'д' и так далее.
// Отобразите массив в консольном окне в прямом и обратном порядке.
// Размер массива задается переменной