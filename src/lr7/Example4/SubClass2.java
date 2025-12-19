package lr7.Example4;

public class SubClass2 extends SubClass1{
    public int intField;

    public SubClass2(char chars, String text, int numb) {
        super(chars, text);
        this.intField = numb;
    }

    public SubClass2 (SubClass2 other) {
        super(other.charField, other.textField);
        this.intField = other.intField;
    }
}
