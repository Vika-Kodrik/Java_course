package lr7.Example4;

public class SuperClass {
    public char charField;

    public SuperClass(char chars) {
        this.charField = chars;
    }

    public SuperClass(SuperClass other) {
        this.charField = other.charField;
    }
}
