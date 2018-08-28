package JavaCore.enums;

/**
 * Enum - перечисления
 *
 * Перечисление - это класс
 * т.е Season - это класс, который содержит только константы, причем каждая константа типа класса(Season)
 */
class EnumExample1 {
    public enum Season {WINTER, SPRING, SUMMER, FALL};

    Season w = Season.WINTER;

    public static void main(String[] args) {
        for (Season s : Season.values())
            System.out.println(s.ordinal() + ": " + s);
    }
}