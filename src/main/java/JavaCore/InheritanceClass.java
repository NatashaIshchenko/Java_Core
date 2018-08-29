package JavaCore;

class A {
    void func1(){System.out.println("A.func1()");}
    public void func2(){System.out.println("A.func2()");}
    void func3(){System.out.println("A.func3()");}
}

class B extends A {
    public void func2(){System.out.println("B.func2()");}
    void func3(int i){System.out.println("B.func3()");}
    void func4(){System.out.println("B.func4()");}
}

/**
 *  - класс-родитель не знает о новых методах потомка, он может вызывать только свои методы у потомка
 */
public class InheritanceClass {
    public static void main(String[] args){
        func1();
        func2();
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
        a.func2(); // вызывает метод потомка
    }

    /**
     * ссылка_на_объект instanceof тип
     * где ссылка_на_объект обозначает ссылку на экземпляр класса, а тип - конкрет­ный тип этого класса.
     * Если ссылка_на_объект относится к указанному типу или может быть приведена к нему, то
     * вычисление оператора instanceof дает в итоге логическое значение true, а иначе - логическое значение false.
     */
    private static void func3(){
        A a = new A();
        B b = new B();
        A b1 = new B();
        System.out.println("a instanceof A = " + (a instanceof A)); //true
        System.out.println("a instanceof B = " + (a instanceof B)); //false - нельзя преобразовать родителя в наследника
        System.out.println("b instanceof A = " + (b instanceof A)); //true - можно преобразовать наследника в родителя
        System.out.println("b1 instanceof A = " + (b1 instanceof A));
    }
}