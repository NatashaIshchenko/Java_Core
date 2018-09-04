package JavaCore.static_final;

public class A {
    private int id;
    public void setId(int id) {this.id = id;}
    public static int getId() {
        //return id; - будет ошибка, так как id не статическая переменная
        return 1;
    }
    public boolean isGood() {return true;}
}
