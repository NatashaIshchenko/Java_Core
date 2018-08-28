package JavaCore.enums;

public class EnumExample2 {

    public enum Season {
        WINTER("Cold season"),
        SPRING("Cool season"),
        SUMMER("Hot season"),
        ALL("Cool season");

        private String description;

        private Season(String description) {
            this.description = description;
        }

        public String getDescription() {return description;}
    };

    public static void main(String[] args) {
        for (EnumExample2.Season s : EnumExample2.Season.values())
            System.out.println(s + ": " + s.getDescription());
    }
}