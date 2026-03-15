package Timus.task_1585;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();

        Map<String, Integer> penguins = new HashMap<>();

        for (int i = 0; i < count; i++) {
            String species = scanner.nextLine();
            penguins.put(species, penguins.getOrDefault(species, 0) + 1);
        }

        String popular = Collections.max(penguins.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.print(popular);
    }
}
