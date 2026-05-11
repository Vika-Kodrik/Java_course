package lr13.task2;
import java.util.Scanner;

class NoPositiveElementsException extends Exception {
    public NoPositiveElementsException(String message) {
        super(message);
    }
}
public class t1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            int[] array = new int[10];

            System.out.println("Введите элементы массива:");

            for (int i = 0; i < array.length; i++) {
                array[i] = readInt(in);
            }

            double average = findAverageOfPositive(array);
            System.out.println("Среднее значение положительных элементов: " + average);

        } catch (NoPositiveElementsException e) {
            System.out.println(e.getMessage());
        }
    }
    public static int readInt(Scanner in) {
        String s = in.nextLine();

        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            if (s.matches("[-+]?\\d+")) {
                System.out.println("Ошибка: число не входит в диапазон int.");
            } else {
                System.out.println("Ошибка: введена строка вместо числа.");
            }
            System.exit(0);
        }
        return 0;
    }

    public static double findAverageOfPositive(int[] array) throws NoPositiveElementsException {
        int sum = 0;
        int count = 0;

        for (int num : array) {
            if (num > 0) {
                sum += num;
                count++;
            }
        }

        if (count == 0) {
            throw new NoPositiveElementsException("Ошибка: в массиве отсутствуют положительные элементы.");
        }

        return (double) sum / count;
    }
}