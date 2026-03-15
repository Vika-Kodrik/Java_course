package lr9.Task_3;
import java.util.Scanner;
public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        inputArray(array, 0);

        System.out.println("Введенный массив:");
        outputArray(array, 0);
    }
    public static void inputArray(int[] array, int index) {
        // Если индекс достиг конца массива
        if (index >= array.length) {
            return;
        }
        System.out.print("Элемент [" + index + "]: ");
        array[index] = scanner.nextInt();

        inputArray(array, index + 1);
    }
    public static void outputArray(int[] array, int index) {
        // Если индекс достиг конца массива
        if (index >= array.length) {
            System.out.println();
            return;
        }
        System.out.print(array[index]);

        if (index < array.length - 1) {
            System.out.print(", ");
        }
        outputArray(array, index + 1);
    }
}
