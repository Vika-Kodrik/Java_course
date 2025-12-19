package lr7.Example4;

public class SubClass1 extends SuperClass{
    public String textField;

    public SubClass1(char chars, String text) {
        super(chars);
        this.textField = text;
    }

    public SubClass1 (SubClass1 other) {
        super(other.charField);
        this.textField = other.textField;
    }
}
