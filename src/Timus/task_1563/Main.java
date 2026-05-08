package Timus.task_1563;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = Integer.parseInt(in.nextLine()); // чтобы считать весь int с переводом строки

        List<String> visited = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < N; i++) {
            String shop = in.nextLine();
            if (visited.contains(shop)) {
                count++;
            } else {
                visited.add(shop);
            }
        }

        System.out.println(count);
    }
}
