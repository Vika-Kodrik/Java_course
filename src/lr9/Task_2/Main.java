package lr9.Task_2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");

        try {
            int number = scanner.nextInt();
            System.out.println("Результат: " + convert(number));
        } catch (Exception e) {
            System.out.println("Ошибка ввода!");
        } finally {
            scanner.close();
        }
    }
    public static String convert(int n) {
        if (n < 0) {
            return "-" + convert(-n);
        }
        if (n == 0) {
            return "0";
        }
        if (n == 1) {
            return "1";
        }
        return convert(n / 2) + (n % 2);
    }
}
