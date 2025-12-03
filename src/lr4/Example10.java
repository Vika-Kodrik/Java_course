package lr4;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Собственный алфавит (русские строчные буквы + пробел)
        char[] alphabet = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м',
                'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я', ' '};

        System.out.println("Введите текст для шифрования: ");
        String text = in.nextLine().toLowerCase();

        System.out.println("Введите ключ: ");
        int key = in.nextInt();
        in.nextLine();

        char[] arrayChar = text.toCharArray();
        char[] arrayCharNew = new char[arrayChar.length];

        for (int i = 0; i < arrayChar.length; i++) {
            int index = -1;
            for (int j = 0; j < alphabet.length; j++) {
                if (alphabet[j] == arrayChar[i]) {
                    index = j;
                    break;
                }
            }
            if (index == -1) {
                arrayCharNew[i] = arrayChar[i];
            } else {
                int newIndex = (index + key) % alphabet.length;
                if (newIndex < 0) { //если ключ отрицательный
                    newIndex += alphabet.length;
                }
                arrayCharNew[i] = alphabet[newIndex];
            }
        }
        text = new String(arrayCharNew);

        System.out.println("Текст после преобразования: " + text);

        System.out.println();

        System.out.println("Выполнить обратное преобразование? (y/n)");
        String answer = in.nextLine();

        if (answer.equals("y")) {
            char[] arrayCharReturn = new char[arrayCharNew.length];
            for (int i = 0; i < arrayCharNew.length; i++) {
                int index = -1;
                for (int j = 0; j < alphabet.length; j++) {
                    if (alphabet[j] == arrayCharNew[i]) {
                        index = j;
                        break;
                    }
                }
                if (index == -1) {
                    arrayCharReturn[i] = arrayCharNew[i];
                } else {
                    int newIndex = (index - key) % alphabet.length;
                    if (newIndex < 0) {
                        newIndex += alphabet.length;
                    }
                    arrayCharReturn[i] = alphabet[newIndex];
                }
            }
            System.out.println("Текст после обратного преобразования: " + new String(arrayCharReturn));
        } else if (answer.equals("n")) {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ");
        }
    }
}

/* 10* (дополнительная задача). Напишите программу «Шифр Цезаря»,
// в которой необходимо реализовать собственный алфавит,
 остальные условия идентичны задаче 8. */