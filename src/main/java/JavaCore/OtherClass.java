package JavaCore;

public class OtherClass {
    public static void main(String[] args){
        runnableFunc();
        overloadingFunc();
        overloadingFunc(1);
        overloadingFunc('a');
        overloadingFunc(1,2);
    }

    // Runnable используется для запуска кода в отдельном потоке
    // public interface Runnable - the Runnable interface should be implemented by any class whose instances are intended to be executed by a thread.
    // The class must define a method of no arguments called run.
    private static void runnableFunc() {
        Runnable rn = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Runnable func line " + i);
            }
        };
        new Thread(rn).start();
    }

    /**
     * overloading(перегрузка) - определение внутри одного класса двух или более методов с одним именем, но разными параметрами
     * В этом случае методы называют перегруженными
     */
    private static void overloadingFunc(){
        System.out.println("overloadingFunc()");
    }
    private static void overloadingFunc(int a){
        System.out.println("overloadingFunc(int a)");
    }
    private static void overloadingFunc(char a){
        System.out.println("overloadingFunc(char a)");
    }
    private static void overloadingFunc(int a, int b){
        System.out.println("overloadingFunc(int a, int b)");
    }
}