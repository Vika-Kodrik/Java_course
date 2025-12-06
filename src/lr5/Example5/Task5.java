package lr5.Example5;

public class Task5 {
    private int intField;

    public Task5() {
        this.intField = 0;
    }

    public Task5 (int value) {
        if (value > 100) {
            this.intField = 100;
        } else {
            this.intField = value;
        }
    }

    public void setIntField() {
        this.intField = 0;
    }

    public void setIntField(int value) {

        if (value > 100) {
            this.intField = 100;
        } else {
            this.intField = value;
        }
    }

    public int getIntField() {
        return intField;
    }
}
