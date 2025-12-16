package lr6.Example1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        MyClass myClass = new MyClass();
        Random random = new Random();

        myClass.setSymbolOrText((char) (random.nextInt(26) + 97)); //буквы a - z из ASCII 97-122);
        System.out.println(myClass.symbol);

        myClass.setSymbolOrText("Hello");
        System.out.println(myClass.text);

        char [] array1 = new char [1];
        array1 [0] = '!';
        myClass.setSymbolOrText(array1);
        System.out.println(myClass.symbol);

        char [] array2 = new char [4];

        array2[0] = 'B';
        array2[1] = 'y';
        array2[2] = 'e';
        array2[3] = '!';

        myClass.setSymbolOrText(array2);
        System.out.println(myClass.text);
    }
}


//1.	Напишите программу с классом, в котором есть два поля: символьное и текстовое.
// В классе должен быть перегруженный метод для присваивания значений полям.
// Если метод вызывается с символьным аргументом, т
// о соответствующее значение присваивается символьному полю.
// Если метод вызывается с текстовым аргументом,
// то он определяет значение текстового ноля.
// Методу аргументом также может передаваться символьный массив.
// Если массив состоит из одного элемента, то он определяет значение символьного поля.
// В противном случае (если в массиве больше одного элемента)
// из символов массива формируется текстовая строка и присваивается значением текстовому полю.