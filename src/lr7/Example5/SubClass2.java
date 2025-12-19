package lr7.Example5;

public class SubClass2 extends SuperClass{
    protected char charField;

    public SubClass2(String text, char chars) {
        super(text);
        this.charField = chars;
    }

    @Override
    public void displayInfo() {
        System.out.println("SubClass2: textField = '" + getTextField() + "', charField = '" + charField + "'");
    }
}
