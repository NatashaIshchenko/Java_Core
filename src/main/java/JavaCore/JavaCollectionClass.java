package JavaCore;

import java.util.*;


/**
 * Класс для работы с Коллекциями
 * Коллекция – это набор объектов, у которого есть различные методы (добавить/удалить объект, удалить/получить все объекты, пробежаться по коллекции)
 */
public class JavaCollectionClass {
    public static void main(String [ ] args)  {
        JavaCollectionClass javaCollectionClass = new JavaCollectionClass();
       // javaCollectionClass.listFunc();
        //javaCollectionClass.setFunc();
        //javaCollectionClass.mapFunc();
        //javaCollectionClass.iteratorFunc();
        javaCollectionClass.queueFunc();
    }

    /**
     * List – это Collection, в котором элементы содержаться в виде списка и есть возможность получить i-тый элемент (элементы могут быть одинаковыми)
     */
    private void listFunc(){
        ArrayList<String> people = new ArrayList<String>();
        //добвление
        people.add("people1");
        people.add("people2");
        people.add("people3");
        people.add("people4");
        people.add("people5");
        people.add("people6");
        people.add(1, "people1_2");
        //расмер списка
        System.out.println("people.size() = " + people.size());
        //получение c использованием цикла
        for(String s:people){System.out.println(s);}
        //получение c использованием лямбды
        people.forEach(s -> System.out.println(s));
        //получение c использованием reference
        people.forEach(System.out::println);
        System.out.println("people.get(0) = " + people.get(0));
        //изменение значения
        people.set(3, "people4_2");
        //удаление
        people.remove("people4");
        people.remove(5);
        for(String s:people){System.out.println(s);}
        //в массив объектов
        Object[] peopleArray = people.toArray();
        for(Object person : peopleArray){ System.out.println(person); }
    }

    /**
     * Итератор - паттерн, позволяющий обходить коллекцию без раскрытия деталей реализации
     * В Java для этих целей создан специальный interface с одноименным названием java.util.Iterator
     * https://metanit.com/java/tutorial/5.10.php
     */
    private void iteratorFunc(){
        ArrayList<String> people = new ArrayList<String>();
        //добвление
        people.add("people1");
        people.add("people2");
        people.add("people3");
        people.add("people4");
        people.add("people5");
        people.add("people6");

        Iterator<String> it = people.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }

    /**
     * Set - это Collection, у которой элементы в 'корзине' уникальны, нет с таким же значением (нет возможности получить элемент по номеру)
     *
     * В HashSet порядок элементов определяется по определенному алгоритму
     * в TreeSet объекты хранятся отсортированными по возрастанию в порядке сравнения
     * в LinkedHashSet хранятся элементы в порядке добавления
     */
    private void setFunc(){
        HashSet<String>  people = new HashSet<>();
        //Добавление
        people.add("people1");
        people.add("people2");
        people.add("people3");
        people.add("people4");
        people.add("people5");
        people.add("people6");
        //расмер сета
        System.out.println("people.size() = " + people.size());
        //удлаение
        people.remove("people5");
        //получение элементов #1
        Iterator<String> iterator = people.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //получение элементов #2
        System.out.println("people.forEach(System.out::println)");
        people.forEach(System.out::println);
        //получение элементов #3
        System.out.println("people.forEach(x -> System.out.println(x))");
        people.forEach(x -> System.out.println(x));
        //проверка наличия элементт
        System.out.println(people.contains("people2"));
    }

    /**
     * Map - все элементы хранятся по ключу (key, values), где key уникален, а values любое
     * каждая пара хранится в поле Map называемом Map.Entry
     *
     * HashMap - структура данных для хранения связанных вместе пар "ключ-значение"
     * TreeMap - отображение с отсортированными ключами
     * EnumMap - отображение с ключами, относящимися к перечислимому типу
     * LinkedHashMap - отображение с запоминанием порядка, в котором добавлялись элементы
     *
     * void clear() - удаляет все пары "ключ-значение" из вызывающего отображения
     * boolean containsKey(Object k) - возвращает значение true, если вызывающее отображение содержит ключ k. В противном случае возвращает false
     * boolean containsValue(Object v) - возвращает значение true, если вызывающее отображение содержит значение v. В противном случае возвращает false
     * Set<Map.Entry<K, V>> entrySet() - возвращает набор, содержащий все значения отображения. Набор содержит объекты интерфейса Map.Entry. Т.е. метод представляет отображение в виде набора
     * boolean equals(Object o) - возвращает значение true, если параметр o - это отображение, содержащее одинаковые значения. В противном случае возвращает false
     * V get(Object k) - возвращает значение, ассоциированное с ключом k. Возвращает значение null, если ключ не найден.
     * int hashCode() - возвращает хеш-код вызывающего отображения
     * boolean isEmpty() - возвращает значение true, если вызывающее отображение пусто. В противном случае возвращает false
     * Set<K> keySet() - возвращает набор, содержащий ключи вызывающего отображения. Метод представляет ключи вызывающего отображения в виде набора
     * V put(K k, V v) - помещает элемент в вызывающее отображение, переписывая любое предшествующее значение, ассоциированное с ключом. Возвращает null, если ключ ранее не существовал. В противном случае возвращается предыдущее значение, связанное с ключом.
     * void putAll(Map<? extends K, ? extends V> m) - помещает все значения из m в отображение
     * V remove(Object k) - удаляет элемент, ключ которого равен k
     * int size() - возвращает количество пар "ключ-значение" в отображении
     * Collection<V> values() - возвращает коллекцию, содержащую значения отображения.
     */
    private void mapFunc(){
        Map<String, String> map = new HashMap<String, String>();
        //добавление
        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");

        HashMap<String, String> map2 = new HashMap<String, String>() {{
            put("a","b");
            put("c", "d");
        }};

        //вывод элементов #1
        for(Map.Entry<String, String> entry: map.entrySet()) {
            //получить ключ
            String key1 = entry.getKey();
            //получить значение
            String value1 = entry.getValue();
            System.out.println( key1+ " " + value1);
        }
        //вывод элементов #2
        Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();
        while(itr.hasNext()) {
            Map.Entry<String, String> entry2 = itr.next();
            //получить ключ
            String key2 = entry2.getKey();
            //получить значение
            String value2 = entry2.getValue();
            System.out.println( key2 + " " + value2);
        }
        //вывод элементов #3
        System.out.println("foreach");
        map2.forEach((k,v) -> System.out.println(k + " : " +v));
    }

    /**
     * Queue (очередь) - интерфейс, расширяюзий интерфейс Collections
     *
     * Очереди представляют структуру данных, работающую по принципу
     * FIFO (first in - first out, "первый пришел первый вышел")
     * LIFO ("Last in first out", "последний пришел первый вышел")
     * или двухсторонний, т.е можно работать с первым и последним элементом
     *
     * ArrayDeque - один из классов, реализующих интерфейс Queue
     *
    */
    private void queueFunc(){
        ArrayDeque<String> states = new ArrayDeque<String>();
        // стандартное добавление элементов
        states.add("Germany");
        states.addFirst("France"); // добавляем элемент в самое начало
        states.push("Great Britain"); // добавляем элемент в самое начало
        states.addLast("Spain"); // добавляем элемент в конец коллекции
        states.add("Italy");
        //вывод всех объектов очереди
        states.forEach(System.out::println);

        // получаем первый элемент без удаления
        String sFirst = states.getFirst();
        System.out.println(sFirst);     // Great Britain
        // получаем последний элемент без удаления
        String sLast = states.getLast();
        System.out.println(sLast);      // Italy

        System.out.printf("Queue size: %d \n", states.size());  // 5

        // перебор коллекции
        while(states.peek()!=null){
            // извлечение c начала
            System.out.println(states.pop());
        }
    }
}