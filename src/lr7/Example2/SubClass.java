package lr7.Example2;

public class SubClass extends SuperClass {

    public int intField;

    public SubClass(int numb, String text) {
        super(text);
        this.intField = numb;
    }

    public void setText() {
        this.intField = 0;
    }

    @Override
    public void setText(String text) {
        super.setText(text);
    }

    public void setText(int numb) {
        this.intField = numb;
    }

    public void setText(int numb, String text) {
        this.intField = numb;
        super.setText(text);
    }
}
