package lr3;

import java.util.Arrays;

public class Example8 {
    public static void main(String[] args) {

        int size = 10;
        char[] ints = new char[size];
        int i = 0;

        for (char letter = 'A'; i < size; letter++) {
            if (letter != 'A' && letter != 'E' && letter != 'I') {
                ints[i] = letter;
                i++;
            }

        } System.out.print(Arrays.toString(ints));
    }
}

// 8. Напишите программу, в которой создается символьный массив из 10 элементов.
// Массив заполнить большими (прописными) буквами английского алфавита.
// Буквы берутся подряд, но только согласные (то есть гласные буквы 'А', 'Е' и 'I'
// при присваивании значений элементам массива нужно пропустить).
// Отобразите содержимое созданного массива в консольном окне.