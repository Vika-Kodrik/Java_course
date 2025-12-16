package lr6.Example1;

public class MyClass {
    char symbol;
    String text;

    public void setSymbolOrText(char symbol) {
        this.symbol = symbol;
    }

    public void setSymbolOrText(String text) {
        this.text = text;
    }
    public void setSymbolOrText(char [] array) {
        if (array.length == 1) {
            this.symbol = array[0];
        } else if (array.length > 1) {
            this.text = String.valueOf(array);
        }
    }
}
