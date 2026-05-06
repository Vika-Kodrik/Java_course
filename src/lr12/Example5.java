package lr12;

import java.util.Random;

public class Example5 {

    private static int globalMax;

    public static int findMax( int [] array) throws InterruptedException {

        // Количество потоков = количество ядер
        int threadCount = Runtime.getRuntime().availableProcessors();
        globalMax = Integer.MIN_VALUE;

        Thread [] threads = new Thread[threadCount];
        for (int i = 0; i < threadCount; i++) {
            final int threadIndex = i;
            threads[i] = new Thread(() -> {
                for (int j = threadIndex; j < array.length; j += threadCount) {
                    synchronized (Example5.class) {
                        if (array[j] > globalMax) {
                            globalMax = array[j];
                        }
                    }
                }
            });
            threads[i].start();
        }
        for (Thread t : threads) {
            t.join();
        }
        return globalMax;
    }

    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        int [] numbers = new int[random.nextInt(10) + 1];
        for ( int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        int max = findMax(numbers);
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(max);

    }
}
// Напишите функцию, которая находит максимальный элемент в массиве целых чисел
// при помощи многопоточности.
// Количество потоков должно быть равно количеству ядер процессора.