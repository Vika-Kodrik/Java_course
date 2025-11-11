package task_1785;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numb = in.nextInt();

        if (numb >= 1 && numb <= 4) {
            System.out.print("few");
        } else if (numb >= 5 && numb <= 9) {
            System.out.print("several");
        } else if (numb >= 10 && numb <= 19) {
            System.out.print("pack");
        } else if (numb >= 20 && numb <= 49) {
            System.out.print("lots");
        } else if (numb >= 50 && numb <= 99) {
                System.out.print("horde");
        } else if (numb >= 100 && numb <= 249) {
            System.out.print("throng");
        } else if (numb >= 250 && numb <= 499) {
            System.out.print("swarm");
        } else if (numb >= 500 && numb <= 999) {
            System.out.print("zounds");
        } else if (numb >= 1000) {
            System.out.print("legion");
        }
    }
}
