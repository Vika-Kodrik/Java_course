package lr5.Example3;

public class Task3 {
    public int a, b;

    public Task3() {
        this.a = 0;
        this.b = 0;
    }

    public Task3(int a) {
        this.a = a;
        this.b = 0;
    }

    public Task3(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void printFields() {
        System.out.println("a = " + a + ", b = " + b);
    }
}
