package lr12;

public class Example4 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread " + i);
            }
        });
        thread.start();
    }
}
//Напишите программу, которая создает 10 потоков и каждый поток выводит на экран свой номер.