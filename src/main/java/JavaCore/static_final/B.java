package JavaCore.static_final;

public class B extends A {
    //@Override - на аннотацию будет ошибка, статические методы нельзя переопределить, их можно только спрятать
    public static int getId() {
        return 2;
    }

    public boolean isGood() {
        return false;
    }
}
