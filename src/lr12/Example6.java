package lr12;

import java.util.Random;

public class Example6 {

    public static int sumParallel(int[] array) throws InterruptedException {

        int cores = Runtime.getRuntime().availableProcessors();
        int[] results = new int[cores];
        Thread[] threads = new Thread[cores];

        for (int t = 0; t < cores; t++) {
            final int threadNum = t;
            threads[t] = new Thread(() -> {
                int sum = 0;
                for (int i = threadNum; i < array.length; i += cores) {
                    sum += array[i];
                }
                results[threadNum] = sum;
            });
            threads[t].start();
        }

        for (Thread q : threads) {
            q.join();
        }

        int total = 0;
        for (int r : results) {
            total += r;
        }

        return total;
    }

    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        int [] numbers = new int[random.nextInt(10) + 1];
        for ( int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(sumParallel(numbers));
    }
}
