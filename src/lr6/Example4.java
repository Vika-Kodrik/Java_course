package lr6;

import java.util.Random;

public class Example4 {
    public static int doubleFactorial (int n) {
        int factorial = 1;
        if (n % 2 == 0) {
            for (int i = n; i >= 2; i -= 2) {
                factorial *= i;
            }
        } else {
            for ( int i = n; i >= 1; i -= 2) {
                factorial *= i;
            }

        } return factorial;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(10) + 1;

        System.out.println("Двойной факториал числа " + n + " равен " + doubleFactorial(n));
    }
}
