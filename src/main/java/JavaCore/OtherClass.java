package JavaCore;

public class OtherClass {
    public static void main(String[] args){
        runnableFunc();
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
}
