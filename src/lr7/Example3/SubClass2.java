package lr7.Example3;

public class SubClass2 extends SubClass1{
    public SubClass2(int numb, char chars, String text) {
        super(numb, chars);
        this.stringField = text;
    }
    public String stringField;

    public void setIntField(int numb, char chars, String text) {
        super.setIntField(numb, chars);
        this.stringField= text;
    }

    public String getStringField() {
        return stringField;
    }

    @Override
    public String toString() {
        String SubClass2NameAndFieldValue;
        SubClass2NameAndFieldValue = "sub2" + "\n" +
                "Class name: " + this.getClass().getSimpleName() + "\n" +
                "intField = " + this.getIntField() + "\n" +
                "CharField = " + this.getCharField() + "\n" +
                "stringField = " + this.getStringField();
        return SubClass2NameAndFieldValue;
    }
}
