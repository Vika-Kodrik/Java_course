package lr5.Example6;

public class Task6 {
    private int max;
    private int min;
    private boolean initialized = false;

    public Task6(int... args) {
        update(args);
    }

    public void update(int... args) {
        if (args.length == 0) {
            return;
        }

        if (!initialized) {
            min = args[0];
            max = args[0];
            initialized = true;
        }

        for (int value : args) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }
    }

    public void display() {
        System.out.println("min: " + min + ", max: " + max);
    }
}

