package JavaCore;

/**
 * Generic(Обобщения)- это параметризованные типы. С их помощью можно объявлять классы, интерфейсы и методы, где тип данных указан в виде параметра
 */
public class GenericClass {

    public static void main(String [ ] args)  {
        Box <Integer> b1 = new Box <Integer> ();
        b1.setItem(5);
        System.out.println(b1.getItem());

        Box <String> b2 = new Box <String> ();
        b2.setItem("test1");
        System.out.println(b2.getItem());
        String str1 = "aaa";
        String str2 = "bbb";
        b2.testFunc(str1, str2);
    }

    static class Box <T> {
        private T item;
        public T getItem() { return item; }
        public void setItem(T o) {item=o;}
        public <A,B> void testFunc(A item1, B item2){ System.out.println("testFunc");}
    }

}
