package JavaCore.lambda_references;

import java.util.LinkedList;
import java.util.List;

/**
 * References - ссылка на метод
 */
public class ReferencesClass {

    public static void main(String[] args){

        List<String> strings = new LinkedList<>();
        strings.add("мама");
        strings.add("мыла");
        strings.add("раму");

        //вариант №1 без References
        //метод forEach() проходит по всем элементам коллекции, вызывает у переданного ему объекта интерфейса Consumer (нашей лямбды) метод accept(),
        // куда и передает каждый элемент из коллекции.
        strings.forEach(x -> System.out.println(x));

        //вариант №2 c References
        //лямбда-выражение (просто вызывающее другой метод) мы можем заменить ссылкой на нужный нам метод
        //главное, чтобы совпадали принимаемые параметры методов (println() и accept())
        strings.forEach(System.out::println);

        //вариант №3 c References
        strings.forEach(ReferencesClass::staticMethod);
    }

    private static void staticMethod(String s) {
        System.out.println("Call staticMethod with parameter = " + s);
    }
}