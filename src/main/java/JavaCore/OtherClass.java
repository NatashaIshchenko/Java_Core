package JavaCore;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 1. Runnable
 * 2. Overloading
 * 3. функции с переменным числом параметров
 * 4. Control structure (if, switch, for, while)
 */
public class OtherClass {

    public static void main(String[] args) {
//        runnableFunc();
//
//        overloadingFunc();
//        overloadingFunc(1);
//        overloadingFunc('a');
//        overloadingFunc(1, 2);
//
//        differentParamsCountFunc(1);
//        differentParamsCountFunc(1,2);
//        differentParamsCountFunc(1,2,3);

        controlStructureFunc();
    }

    /**
     * 1. Runnable
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
     * 2. Overloading
     *
     * overloading(перегрузка) - определение внутри одного класса двух или более методов с одним именем, но разными параметрами
     * В этом случае методы называют перегруженными
     */
    private static void overloadingFunc() {
        System.out.println("overloadingFunc()");
    }

    private static void overloadingFunc(int a) {
        System.out.println("overloadingFunc(int a)");
    }

    private static void overloadingFunc(char a) {
        System.out.println("overloadingFunc(char a)");
    }

    private static void overloadingFunc(int a, int b) {
        System.out.println("overloadingFunc(int a, int b)");
    }

    /**
     * 3. функции с переменным числом параметров
     */
    public static void differentParamsCountFunc(int ... num){
        int[] num2=num;
        int summa = 0;
        for(int i:num){ summa+=i;}
        System.out.println("sum = " + summa);
    }

    /**
     * 4. Control structure
     */
    private static void controlStructureFunc(){
        // for

        int[] mas = {1,2,3,4,5};

        System.out.println("Вывод массива путем for(int i:mas)");
        for(int i:mas)
            System.out.println(i);

        System.out.println("Вывод массива путем for(int i=0; i<=mas.length-1; i++)");
        for(int i=0; i<=mas.length-1; i++)
            System.out.println(mas[i]);

        // switch

        int a = 1;
        switch (a) {
            case 0:
                System.out.println("This 0");
                break;
            case 1:
                System.out.println("This 1");
                break;
            default:
                System.out.println("We don't know what is this");
        }

        // if

        if (a==0)
            System.out.println("a=0");
        else if (a==1)
            System.out.println("a=1");
        else
            System.out.println("a!=0 and a!=1");

        // while

        int count = 0;
        while(count<5){
            System.out.println("count = " + count);
            count++;
        }
    }
}