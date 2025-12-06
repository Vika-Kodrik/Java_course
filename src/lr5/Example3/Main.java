package lr5.Example3;

public class Main {
    public static void main(String[] args) {

        Task3 obj1 = new Task3();
        Task3 obj2 = new Task3(3);
        Task3 obj3 = new Task3(3,5);

        obj1.printFields();
        obj2.printFields();
        obj3.printFields();

    }
}

/* Напишите программу с классом,
у которого есть два целочисленных поля.
В классе должны быть описаны конструкторы,
позволяющие создавать объекты без передачи аргументов,
с передачей одного аргумента
и с передачей двух аргументов.*/
