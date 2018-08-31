package JavaCore;

public class ExceptionClass {

    public static void main(String[] args){
        func1();

        //обрабатываем exception,  который может выбросить метод
        try {
            func2();
        } catch (Exception ex){
            System.out.println("Поймали exception который выбросил метод");
        }
    }

    private static void func1(){
        try {
            int count = 1/0;
            String[] catNames = {"Васька", "Барсик", "Мурзик"};
            catNames[3] = "Рыжик"; //нет элемента под этим индексом
            System.out.println("Не увидим это сообщение");
        } catch (ArithmeticException e) {
            System.out.println("Обработали ошибку 'деление на 0' ");
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Обработали ошибку ArrayIndexOutOfBoundsException");
            e.printStackTrace();
        } finally {
            System.out.println("Блок, который выполняется всегда");
        }
    }

    //сами сздаем exception
    // при объявлении метода указываем, что он может выбросить exception
    private static void func2() throws IllegalAccessException {
        throw new IllegalAccessException("Создали IllegalAccessException");
    }
}