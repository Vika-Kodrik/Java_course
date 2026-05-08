package Timus.task_1100;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Team[] teams = new Team[n];

        for (int i = 0; i < n; i++) {
            String[] parts = br.readLine().split(" ");
            int id = Integer.parseInt(parts[0]);
            int m = Integer.parseInt(parts[1]);
            teams[i] = new Team(id, m);
        }

        // Сортировка по убыванию M
        Arrays.sort(teams, (a, b) -> {
            if (a.m > b.m) return -1;  // a больше → a идёт первым
            if (a.m < b.m) return 1;   // a меньше → a идёт после b
            return 0;                   // равны → сохраняем порядок
        });

        PrintWriter out = new PrintWriter(System.out);
        for (Team t : teams) {
            out.println(t.id + " " + t.m);
        }
        out.close();
    }

    static class Team {
        int id, m;
        Team(int id, int m) {
            this.id = id;
            this.m = m;
        }
    }
}