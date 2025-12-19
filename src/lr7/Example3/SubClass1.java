package lr7.Example3;

public class SubClass1 extends SuperClass{
    public SubClass1(int numb, char chars) {
        super(numb);
        this.CharField = chars;
    }
    public char CharField;

    public void setIntField(int numb, char chars) {
        super.setIntField(numb);
        this.CharField = chars;
    }

    public char getCharField() {
        return CharField;
    }

    @Override
    public String toString() {
        String SubClass1NameAndFieldValue;
        SubClass1NameAndFieldValue = "sub1" + "\n" +
                "Class name: " + this.getClass().getSimpleName() + "\n" +
                "intField = " + this.getIntField() + "\n" +
                "CharField = " + this.getCharField();
        return SubClass1NameAndFieldValue;
    }
}


