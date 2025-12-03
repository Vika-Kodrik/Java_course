package lr4;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст для шифрования: ");
        String text = in.nextLine();
        System.out.println("Введите ключ: ");
        int key = in.nextInt();
        in.nextLine();

        char [] arrayChar = text.toCharArray();
        long [] arrayInt = new long[arrayChar.length];
        char [] arrayCharNew = new char[arrayChar.length];

        for (int i = 0; i < arrayChar.length; i++) {
            arrayInt[i] = arrayChar[i] + key;
            arrayCharNew [i] = (char) arrayInt[i];
        }
        text = new String (arrayCharNew);

        System.out.println("Текст после преобразования: " + text);

        System.out.println();

        System.out.println("Выполнить обратное преобразование? (y/n)");
        String answer = in.nextLine();
        char [] arrayCharReturn = new char [arrayChar.length];

        if (answer.equals("y")) {
            for (int i = 0; i < arrayCharNew.length; i++) {
                arrayInt[i] = arrayCharNew[i] - key;
                arrayCharReturn[i] = (char) arrayInt[i];
            }
            System.out.print(arrayCharReturn);
        } else if (answer.equals("n")) {
            System.out.println("До свидания!");
        } else {
                System.out.println("Введите корректный ответ");
        }
    }
}

/* 8.	Напишите программу «Шифр Цезаря», которая зашифровывает введенный текст.
Используете кодовую таблицу символов.
При запуске программы в консоль необходимо вывести сообщение:
«Введите текст для шифрования», после ввода текста, появляется сообщение:
«Введите ключ». После того как введены все данные,
необходимо вывести преобразованную строку с сообщением «Текст после преобразования: ».
Далее необходимо задать вопрос пользователю: «Выполнить обратное преобразование? (y/n)»,
если пользователь вводит «y», тогда выполнить обратное преобразование.
Если пользователь вводит «n», того программа выводит сообщение «До свидания!».
Если пользователь вводит что-то другое, отличное от «y» или «n»,
то программа ему выводит сообщение: «Введите корректный ответ». */