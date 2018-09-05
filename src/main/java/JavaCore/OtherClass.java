package JavaCore;


/**
 * 1. Overloading
 * 2. функции с переменным числом параметров
 * 3. Control structure (if, switch, for, while)
 * 4. Continue
 * 5. Break
 * 6. Парсинг
 */
public class OtherClass {

    public static void main(String[] args) {

        overloadingFunc();
        overloadingFunc(1);
        overloadingFunc('a');
        overloadingFunc(1, 2);

        differentParamsCountFunc(1);
        differentParamsCountFunc(1,2);
        differentParamsCountFunc(1,2,3);

        controlStructureFunc();
        continueFunc();
        breakFunc();
        parseFunc();
    }

    /**
     * 1. Overloading
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
     * 2. функции с переменным числом параметров
     */
    public static void differentParamsCountFunc(int ... num){
        int[] num2=num;
        int summa = 0;
        for(int i:num){ summa+=i;}
        System.out.println("sum = " + summa);
    }

    /**
     * 3. Control structure
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

    /**
     * 4. Continue
     *
     * The continue statement is used in loop control structure when you need to jump to the next iteration of the loop immediately.
     * It can be used with for loop or while loop
     */
    private static void continueFunc(){

        for(int i=1;i<=10;i++){
            if(i==5){ // 5 не выведет
                //using continue statement
                continue;//it will skip the rest statement
            }
            System.out.println(i);
        }
    }

    /**
     * 5. Break
     *
     * When a break statement is encountered inside a loop, the loop is immediately terminated and the program control resumes
     * at the next statement following the loop
     */
    private static void breakFunc(){
        for(int i=1;i<=10;i++){
            if(i==5){ //далее 5ого уикл не продолжится
                break;
            }
            System.out.println(i);
        }
    }

    /**
     * 6. Парсинг
     */
    private static void parseFunc(){
        int i = Integer.parseInt("123");
        long l = Long.parseLong("111111111");
        String s = String.valueOf(123.01);
    }
}