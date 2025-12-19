package lr7.Example5;

public class SuperClass {
    private String textField;

    public SuperClass(String text) {
        this.textField = text;
    }

    public String getTextField() {
        return textField;
    }

    public void displayInfo() {
        System.out.println("SuperClass: textField = '" + textField + "'");
    }
}
