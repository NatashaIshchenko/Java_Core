package JavaCore;

class A {
    void func1(){System.out.println("A.func1()");}
    public void func2(){System.out.println("A.func2()");}
    void func3(){System.out.println("A.func3()");}
    void func3(int a, int b){System.out.println("A.func3(int a, int b) = "+ (a+b));}
    private void func7(){System.out.println("A.func7()");}
    public void func8(){func7();}
}

class B extends A {
    public void func2(){System.out.println("B.func2()");}
    void func3(int a){System.out.println("B.func3(int a) = "+a);}
    void func4(){System.out.println("B.func4()");}
    void func7(){System.out.println("B.func7()");}
    public void func9(){System.out.println("B.func9()");}
}
class C extends A {
}

/**
 *  класс-родитель не знает о новых методах потомка, он может вызывать только свои методы у потомка
 *  полиморфизм - наследник переопределяет метод родителя; можно использовать аннотацию @override (переопределение), подскажет, если нет метода у родителя
 *  final class не наследуется; final метод не овверайдится
 *
 *  связывание - присоединение вызова метода к телу метода
 *  раннее(статическое) связывание - связывание происходит на моменте компиляции (пример: 1) private методы 2) методы вызванниые с super.func())
 *  позднее(динамическое) связывание - связывание происходит на моменте выполенения программы в зависимости от объекта
 *  http://pr0java.blogspot.com/2015/07/blog-post_66.html
 *
 *  Раннее связывание, происходит на этапе компиляции. Оно применяется при вызове обычных методов (не виртуальных).
 *  Позднее связывание напротив происходит во время выполнения. Выполняется оно при вызове виртуальных функций класса-потомка
 *  для определения того, какой именно метод следует вызывать.
 */
public class InheritanceClass {

    public static void main(String[] args){
        //func1();
        //func2();
       func3();

    }

    private static void func1(){
        B b = new B();
        b.func1();
        b.func2();
        b.func3();
        b.func3(0);
        b.func4();
    }

    private static void func2(){
        A a = new B();
        //B b = new A(); - ругается, не может сузить A до B
        a.func2(); // вызывает метод потомка
        // a.func9(); - ругается, так как а не знает метода func9()
        ((B) a).func9(); // вызовет метод потомка
        //a.func7() - ругается так как метод приватный
        ((B) a).func7(); //вызовет метод потомка
    }

    /**
     * ссылка_на_объект instanceof тип
     * где ссылка_на_объект обозначает ссылку на экземпляр класса, а тип - конкрет­ный тип этого класса.
     * Если ссылка_на_объект относится к указанному типу или может быть приведена к нему, то
     * вычисление оператора instanceof дает в итоге логическое значение true, а иначе - логическое значение false.
     * https://www.javatpoint.com/downcasting-with-instanceof-operator
     */
    private static void func3(){
        A a = new A();
        B b = new B();
        A a1 = new B();
        System.out.println("a instanceof A = " + (a instanceof A)); //true
        System.out.println("a instanceof B = " + (a instanceof B)); //false
        System.out.println("b instanceof A = " + (b instanceof A)); //true
        System.out.println("b1 instanceof A = " + (a1 instanceof A)); //true
        System.out.println("b1 instanceof A = " + (a1 instanceof B)); //true
        System.out.println("b1 instanceof A = " + (a instanceof C)); // false
        System.out.println("b1 instanceof A = " + (a1 instanceof C)); // false
        System.out.println("a instanceof C = " + (a instanceof C)); // false
        //C c = (C) a; //- ошибка "JavaCore.A cannot be cast to JavaCore.C"
        A a2 = (A) b; //можно

        Object obj = new Object();
        System.out.println("obj instanceof C = " + (obj instanceof C)); // false
    }
}