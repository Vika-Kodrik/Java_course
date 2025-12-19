package lr7.Example5;

public class SubClass1 extends SuperClass{
    protected int intField;

    public SubClass1(String text, int numb) {
        super(text);
        this.intField = numb;
    }


    @Override
    public void displayInfo() {
        System.out.println("SubClass1: textField = '" + getTextField() + "', intField = " + intField);
    }
}
