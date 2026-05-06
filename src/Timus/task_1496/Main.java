package Timus.task_1496;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            if (!seen.add(name)) {
                duplicates.add(name);
            }
        }

        for (String name : duplicates) {
            System.out.println(name);
        }
    }
}
