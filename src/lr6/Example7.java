package lr6;

import java.util.Random;
import java.util.Arrays;

public class Example7 {
    public static int [] getCharCode (char [] chars) {
        if (chars == null) {
            return new int[0];
        }
        int [] codes = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            codes[i] = chars[i];
        }
        return codes;
    }

    public static void main(String[] args) {
        Random random = new Random();
        char [] symbols = new char[random.nextInt(10) + 1];
        for (int i = 0; i < symbols.length; i++) {
            symbols[i] = (char) (random.nextInt(26) + 97); //буквы a - z из ASCII 97-122
        }
        int [] codes = getCharCode(symbols);

        System.out.println("Символы: " + Arrays.toString(symbols));
        System.out.println("Коды: " + Arrays.toString(codes));
    }
}


/*
7.	Напишите программу со статическим методом,
аргументом которому передастся символьный массив,
а результатом возвращается ссылка на целочисленным массив,
состоящий из кодов символов из массива- аргумента.*/
