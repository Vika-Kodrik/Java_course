package lr7.Example2;

public class SuperClass {

    private String field;

    public SuperClass(String text) {
        this.field = text;
    }

    public void setText(String text) {
        this.field = text;
    }

    public int lengthStr() {
        if (this.field == null) {
            return 0;
        }
        return field.length();
    }
}
