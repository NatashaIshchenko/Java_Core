package JavaCore;

/**
 * Для создания потока есть класс Thread. Есть 2 варианта создания потока:
 *  - наследование от класса Thread
 *  - использовать интерфейс с Runnable
 */
public class ThreadClass {

    public static void main(String[] args){
        // использование интерфейса Runnable
        runnableFunc();

        // наследование от класса Thread
        MyThread t2 = new MyThread();
        t2.start();

        //способ остановки потока
        try {Thread.sleep(1000);}
        catch (InterruptedException e) {}

    }

    /**
     * использование интерфейса Runnable
     *
     * Runnable используется для запуска кода в отдельном потоке
     * public interface Runnable - the Runnable interface should be implemented by any class whose instances are intended to be executed by a thread.
     * The class must define a method of no arguments called run.
     */
    private static void runnableFunc() {
        Runnable rn = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Runnable func line " + i);
            }
        };
        new Thread(rn).start();
    }

    /**
     * наследование от класса Thread
     */
    private static class MyThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Run func from MyThread " + i);
            }
        }
    }

    /**
     *  synchronized  методы
     *
     *  если один поток вызывает у объекта синхронайзд метод, то другой поток не может вызвать у объекта ни один другой синхронайзд метод
     *  (не синхронайзд метод - может). Т.е в качестве лока является объект.
     *  Бывает DeadLock. Когда идет перекрестный вызов синхронайзд методов объектов разными потоками
     */
    private class Counter {
        int c = 0;
        public synchronized void inc() {c++;}
        public synchronized void dec() {c--;}
        public int getC() {return c;}
    }
}
