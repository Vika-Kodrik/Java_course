package lr6;

public class Example2 {

    private static int value = 0;

    public static void showAndIncrement() {
        System.out.println("Текущее значение: " + value);
        value++;
    }

    public static void main(String[] args) {
        System.out.println("Показ работы счетчика: ");
        showAndIncrement();
        showAndIncrement();
        showAndIncrement();
    }
}

/* Напишите программу с классом, в котором есть закрытое статическое целочисленное ноле
 с начальным нулевым значением. В классе должен быть описан статический метод,
 при вызове которого отображается текущее значение статического поля,
 после чего значение поля увеличивается на единицу.*/
