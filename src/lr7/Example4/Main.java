package lr7.Example4;

public class Main {
    public static void main(String[] args) {
        // Создание объекта через конструктор с параметрами
        SubClass2 obj1 = new SubClass2('A', "Hello", 123);
        System.out.println("Объект создан через конструктор с параметрами:");
        System.out.println("charField: " + obj1.charField);
        System.out.println("textField: " + obj1.textField);
        System.out.println("intField: " + obj1.intField);

        // Создание копии объекта
        SubClass2 obj2 = new SubClass2(obj1);
        System.out.println("\nКопия объекта");
        System.out.println("charField: " + obj2.charField);
        System.out.println("textField: " + obj2.textField);
        System.out.println("intField: " + obj2.intField);

    }
}

/*
4.	Напишите программу, в которой использована цепочка наследования из трех классов.
В первом классе есть открытое символьное поле.
Во втором классе появляется открытое текстовое поле.
В третьем классе появляется открытое целочисленное поле.
В каждом из классов должен быть конструктор,
позволяющий создавать объект на основе значений полей, переданных аргументами конструктору,
а также конструктор создания копии.*/
