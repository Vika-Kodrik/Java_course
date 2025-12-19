package Timus.task_1001;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Long> numbers = new ArrayList<>();

        while (scanner.hasNext()) { //читать, пока есть ввод
            if (scanner.hasNextLong()) {
                numbers.add(scanner.nextLong());
            } else {
                scanner.next();
            }
        }

        for ( int i = numbers.size() - 1; i >= 0; i--) {
            double root = Math.sqrt(numbers.get(i));
            System.out.printf("%.4f\n", root);
        }
    }
}
