package lr13.task2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class t2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        int columnNumber = -1;
        boolean validInput = false;

        // Цикл для повторного ввода при ошибках
        while (!validInput) {
            try {
                System.out.print("\nВведите номер столбца: ");
                columnNumber = scanner.nextInt();

                if (columnNumber < 0 || columnNumber >= matrix[0].length) {
                    throw new IllegalArgumentException("Столбца с номером " + columnNumber + " не существует!");
                }

                validInput = true;

                // Вывод столбца
                System.out.println("\nСтолбец №" + columnNumber + ":");
                printColumn(matrix, columnNumber);

            } catch (InputMismatchException e) {
                System.out.println("Ошибка: Введена строка вместо числа!");
                scanner.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }

    public static void printColumn(int[][] matrix, int column) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][column]);
        }
    }
}
