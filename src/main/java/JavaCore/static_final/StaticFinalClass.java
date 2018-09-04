package JavaCore.static_final;

public class StaticFinalClass {

    public static void main(String[] args){
        B b = new B();
        System.out.println("b.getId() = " + b.getId()); // 2

        A a = new A();
        System.out.println("a.getId() = " + a.getId()); // 1

        A c = new B();
        System.out.println("c.getId() = " + c.getId()); // 1

        System.out.println("A.getId() = " + A.getId()); // 1

        System.out.println("B.getId() = " + B.getId()); // 2
    }
}




