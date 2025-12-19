package lr7.Example3;

public class SuperClass {
    public int intField;

    public void setIntField(int numb) {
        this.intField = numb;
    }

    public int getIntField() {
        return intField;
    }

    public SuperClass(int numb) {
        this.intField = numb;
    }

    @Override
    public String toString() {
        String SuperClassNameAndFieldValue;
        SuperClassNameAndFieldValue = "super" + "\n" +
                "Class name: " + this.getClass().getSimpleName() + "\n" +
                "intField = " + this.getIntField();
        return SuperClassNameAndFieldValue;
    }
}




