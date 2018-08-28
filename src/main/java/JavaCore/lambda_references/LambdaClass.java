package JavaCore.lambda_references;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * Лямбда-выражение представляет собой блок кода, который можно передать в другое место, поэтому он может быть выполнен позже, один или несколько раз.
 *
 * Лямбда-выражение — это такая функция. Можете считать, что это обычный метод в Java, только его особенность в том,
 * что его можно передавать в другие методы в качестве аргумента.
 *
 * Синтаксис: (параметры) -> {тело метода}
 *
 * Лямбда-выражения имеют доступ к final переменным из охватывающей области видимости
 * Ссылки на метод и конструктор ссылаются на методы или конструкторы без их вызова
 * с помощью лямбда-выражений можно реализовывать методы интерфейсов
 */
public class LambdaClass {
    public static void main(String[] args) {
        LambdaClass lambdaClass = new LambdaClass();
        lambdaClass.interfaceFunc1();
        lambdaClass.interfaceFunc2();
        lambdaClass.listFunc();
        lambdaClass.runnableFunc();
    }

    //реалихация метода интерфейса без лямбды
    private void interfaceFunc1() {
        IncrementerInterface incrementerInterface = new IncrementerInterface() {
            @Override
            public int increment(int x) {
                return x + 1;
            }
        };
        System.out.println(incrementerInterface.increment(1));
    }

    //реалихация метода интерфейса с лямбдой
    private void interfaceFunc2() {
        //в интерфейсе IncrementerInterface только один метод не реализованный (если будет несколько, то не сможем юзать лямбда);
        //с помощью ламбда-выражения реализуем этод метод: (входные параметры) -> код функции
        IncrementerInterface incrementerInterface = x -> x + 1;
        System.out.println(incrementerInterface.increment(1));
    }

    //вывод данных списка с и без использования лямбды
    private void listFunc(){
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("str1");
        list1.add("str2");
        list1.add("str3");
        list1.add("str4");
        System.out.println("Print arraylist Without lambda_references");
        list1.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("Print arraylist With lambda_references");
        list1.forEach(s -> System.out.println(s));
        System.out.println("Print arraylist with refferance");
        list1.forEach(System.out::println);
    }

    //lambda_references with runnable
    //Runnable используется для запуска кода в отдельном потоке
    private void runnableFunc(){
        Runnable rn = () -> {
            for(int i=0;i<10;i++) {
                System.out.println("Runnable func line " + i);
             }
        };
        //варинат выполнения #1
        rn.run();
        //варинат выполнения #2
        new Thread(rn).start();
    }

}