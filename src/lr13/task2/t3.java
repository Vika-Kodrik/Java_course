package lr13.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class t3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte[] array = new byte[10];
        byte summ = 0;

        for (int i = 0; i < array.length; i++) {
            try {
                int input = in.nextInt();

                if (input < -128 || input > 127) {
                    throw new ArithmeticException("Ошибка: Число " + input + " не входит в диапазон byte!");
                }

                byte n = (byte) input;
                array[i] = n;

                if (summ > 0 && n > 0 && summ > Byte.MAX_VALUE - n) {
                    throw new ArithmeticException("Сумма превышает максимальное значение byte");
                }
                if (summ < 0 && n < 0 && summ < Byte.MIN_VALUE - n) {
                    throw new ArithmeticException("Сумма меньше минимального значения byte");
                }
                summ += n;

            } catch (InputMismatchException e) {
                System.out.println("Ошибка: Введена строка вместо числа!");
                in.nextLine();
                i--; // Повторяем ввод текущего элемента
            } catch (ArithmeticException e) {
                System.out.println("Ошибка: " + e.getMessage());
                i--; // Повторяем ввод текущего элемента
                in.nextLine();
            }
        }
        System.out.println("Сумма: " + summ);
    }
}
