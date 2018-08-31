package JavaCore;

import java.util.*;

/**
 *  Interface (договор/контракт взаимодействия):
 *   - cодержит только определение методов без тела
 *   - класс реализующий интерфейс должен реализовать все методы; не все метожы может реадизовывть абстрактыный класс
 *   - класс может имплементировать (реализовывать) несколько интерфейсов
 *   - интерфейсы могут наследовать друг друга
 *   - переменные описанные в интерфейсе, становятся public static final в имеплеменируещем классе
 *   - в интерфесе методы объявляются как public
 *
 *   Интерфейсы — это не классы. С помощью ключевого слова new нельзя создать экземпляр интерфейса, но можно объявлять интерфейсные переменные
 */

interface Interface_1 {
    int a = 5;
    void doSmth();
    void getNum();
}

interface Interface_2 extends Interface_1 {
    void doSmth();
    void getNum_2();
}

public class InterfaceClass implements Interface_1, Interface_2{

    public static void main(String[] args){
        InterfaceClass interfaceClass = new InterfaceClass();
        interfaceClass.doSmth();
        interfaceClass.getNum();
        interfaceClass.getNum_2();
        System.out.println(interfaceClass.a);

        //Set - интерфейс; HashSet, LinkedHashSet - классы его имплементирующие
        Set<String> s1 = new HashSet<>();
        Set<String> s2 = new LinkedHashSet<>();
    }

    @Override
    public void doSmth() {
        System.out.println("doSmth");
    }

    @Override
    public void getNum_2() {
        System.out.println("getNum_2");
    }

    @Override
    public void getNum() {
        System.out.println("getNum");
    }
}