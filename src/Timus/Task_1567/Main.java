package Timus.Task_1567;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] array1 = {"a", "d", "g", "j", "m", "p", "s", "v", "y", ".", " "};
        String [] array2 = {"b", "e", "h", "k", "n", "q", "t", "w", "z", ","};
        String [] array3 = {"c", "f", "i", "l", "o", "r", "u", "x", "!"};

        int count = 0;
        String str;

        str = scanner.nextLine();
        String [] text = str.split("");

        for (String str1 : text) {
            for (String str2 : array1) {
                if (str1.equals(str2)) {
                    count++;
                }
            }
        }

        for (String str1 : text) {
            for (String str2 : array2) {
                if (str1.equals(str2)) {
                    count += 2;
                }
            }
        }

        for (String str1 : text) {
            for (String str2 : array3) {
                if (str1.equals(str2)) {
                    count += 3;
                }
            }
        }
        System.out.println(count);
    }
}
