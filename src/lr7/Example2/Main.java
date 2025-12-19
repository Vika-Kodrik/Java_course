package lr7.Example2;

public class Main {
    public static void main(String[] args) {
        SuperClass superObj = new SuperClass("Hello");
        System.out.println("SuperClass length: " + superObj.lengthStr());

        // Создание объекта подкласса
        SubClass subObj = new SubClass(42, "World");
        System.out.println("SubClass text length: " + subObj.lengthStr());
        System.out.println("SubClass int field: " + subObj.intField);

        // Тестирование всех версий setText()
        subObj.setText(); // без параметров
        System.out.println("After setText(): " + subObj.intField);

        subObj.setText("Test"); // текстовый параметр
        System.out.println("Text length after setText(String): " + subObj.lengthStr());

        subObj.setText(100); // целочисленный параметр
        System.out.println("Int field after setText(int): " + subObj.intField);

        subObj.setText(200, "Final"); // оба параметра
        System.out.println("Final text length: " + subObj.lengthStr());
        System.out.println("Final int field: " + subObj.intField);
    }
}


/*
2.	Напишите программу, в которой есть суперкласс с приватным текстовым полем.
В базовом классе (суперклассе) должен быть метод для присваивания значения полю с текстовым параметром.
Объект суперкласса создается передачей одного текстового аргумента конструктору.
Добавьте метод, который возвращает длину текстовой строки.
На основе суперкласса создается подкласс.
В подклассе появляется дополнительное открытое (публичное) целочисленное поле.
В классе должны быть такие версии метода для присваивания значений полям
(используется переопределение и перегрузка метода из суперкласса):
без параметров, с текстовым параметром,
с целочисленным параметром, с текстовым и целочисленным параметром.
У конструктора подкласса два параметра (целочисленный и текстовый).*/
