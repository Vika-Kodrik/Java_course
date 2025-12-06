package lr5.Example5;

public class Main {
    public static void main(String[] args) {

        Task5 obj1 = new Task5();
        System.out.println("obj1: " + obj1.getIntField());

        Task5 obj2 = new Task5(50);
        System.out.println("obj2: " + obj2.getIntField());

        Task5 obj3 = new Task5(150);
        System.out.println("obj3: " + obj3.getIntField());

        obj1.setIntField();
        System.out.println("obj1 после setValue(): " + obj1.getIntField());

        obj2.setIntField(50);
        System.out.println("obj2 после setValue(): " + obj2.getIntField());

        obj3.setIntField(150);
        System.out.println("obj3 после setValue(): " + obj3.getIntField());

    }
}
/*
5. Напишите программу с классом, у которого есть закрытое целочисленное поле.
Значение полю присваивается с помощью открытого метода.
Методу аргументом может передаваться целое число, а также метод может вызываться без аргументов.
Если методы вызывается без аргументов, то поле получает нулевое значение.
Если метод вызывается с целочисленным аргументом, то это значение присваивается полю.
Однако если переданное аргументом методу значение превышает 100,
то значением полю присваивается число 100.
Предусмотрите в классе конструктор,
 который работает по тому же принципу, что и метод для присваивания значения полю.
 Также в классе должен быть метод, позволяющий проверить значение поля.*/
