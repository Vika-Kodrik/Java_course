package lr6;

import java.util.Random;

public class Example8 {
    public static double avarage(int [] array) {
        int sum = 0;
        for (int n : array) {
            sum += n;
        }
        return (double) sum / array.length;

    }

    public static void main(String[] args) {
        Random random = new Random();
        int [] array = new int[random.nextInt(10) + 1];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        double avarage = avarage(array);

        System.out.printf("%.2f%n", avarage);
    }
}
