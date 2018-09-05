package JavaCore;

/**
 *  Абстрактный класс содержит собственные переменные/методы и абстрактные методы (без реализации).
 *   - нельзя создать  объект абстрактного класса
 *   - класс может наследовать только один абстрактный класс
 *   - класс наследующий абстрактный класс должен реализовать все методы; не все может реализовывать другой абстрактный класс
 *
 *  интерфейс используют как 'контракт', а абстрактный класс в основном для того что бы уменьшить дублирование кода
 * (интерфейс – контракт, абстрактный класс - класс)
 *
 */
abstract class Super1 {
    private int id = 5;
    public Super1(){System.out.println("Constructor Super1");}
    public int getId() {return id;}
    public abstract void test1();
}

abstract class Super2 extends Super1{
    public abstract void test2();

}

public class AbstractClass extends Super2{

    public static void main(String[] args){
        AbstractClass abstractClass = new AbstractClass();
        abstractClass.test1();
        abstractClass.test2();
        System.out.println(abstractClass.getId());

        //создается не объект абстрактного класса, а наследник, реализующие абстрактные методы
        Super1 s = new Super1() {
            @Override
            public void test1() {
                System.out.println("Реализация абтрактного метода test1()");
            }
        };
    }

    @Override
    public void test1() {
        System.out.println("test1()");
    }

    @Override
    public void test2() {
        System.out.println("test2()");
    }
}
