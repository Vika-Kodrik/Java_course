package lr5.Example2;

public class Task2 {

    public char ch1;
    public char ch2;

    public Task2(char ch1, char ch2) {
        this.ch1 = ch1;
        this.ch2 = ch2;
    }

    public void allSymbolBetween() {
        char start = (char) Math.min(ch1, ch2);
        char end = (char) Math.max(ch1, ch2);

        for (char ch = start; ch <= end; ch++) {
            System.out.print(ch);
            System.out.print(" ");
        }
        System.out.println();
    }
}


