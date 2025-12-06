package lr5.Example4;

public class Task4 {
    public char charField;
    public int intField;

    public Task4(char symbol, int code) {
        this.charField = symbol;
        this.intField = code;
    }

    public Task4(double value) {
        this.charField = (char) ((int) value);
        double fractional = value - (int) value;
        this.intField = (int) (fractional * 100);
    }

    public char getCharField() {
        return charField;
    }

    public int getIntField() {
        return intField;
    }

    public void printFields() {
        System.out.println("Значение символьного поля: " + charField + "; код: " + (int) charField);
        System.out.println("Целочисленное поле: " + intField);

    }
}






