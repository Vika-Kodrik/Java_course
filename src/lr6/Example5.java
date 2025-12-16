package lr6;

import java.util.Random;

public class Example5 {

    public static int sumOfSquare(int n) {
        int summ = 0;
        for (int i = 1; i <= n; i++) {
            summ += i * i;
        }
        return summ;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(10) + 1;

        System.out.println(sumOfSquare(n));
        System.out.println("Проверка: " + n * (n + 1) * (2*n + 1) / 6);
    }
}
