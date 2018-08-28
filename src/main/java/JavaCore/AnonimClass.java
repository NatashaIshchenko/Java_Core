package JavaCore;


class A{
    public void func1() {System.out.println("111");}
    public void func2() {System.out.println("222");}
}

interface B{
    void func3();
}

/**
 * Анонимные внутренние классы объявляются без указания имени класса. Они могут быть созданы двумя путями
 */
public class AnonimClass {
    public static void main(String[] args){

        //Способ создания №1: Как наследник определённого класса
        A a = new A(){
            public void func1() {System.out.println("aaa");}
        };
        a.func1();
        a.func2();

        //Способ создания №2: Как реализация определённого интерфейса
        B b = new B() {
            public void func3() {
                System.out.println("333");
            }
        };
        b.func3();
        //как  реализация определенного интерфейся с использонием ламбда
        B c = () -> System.out.println("444");
        c.func3();
    }
}
