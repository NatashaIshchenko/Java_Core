package JavaCore;

public class StringClass {

    public static void main(String[] args) {

        //Java StringBuilder class is used to create mutable (modifiable) string.
        // The Java StringBuilder class is same as StringBuffer class except that it is non-synchronized
        StringBuilder sb = new StringBuilder("Hello ");
        sb.append("Java");
        sb.insert(5, " World ");
        System.out.println(sb);

        //split
        String s1 = "java string split method by javatpoint";
        String[] words = s1.split("\\s");//splits the string based on whitespace
        for (String w : words)
            System.out.println(w);

        //valueOf() method converts different types of values into string.
        int value=30;
        String s2=String.valueOf(value);
        System.out.println(s2+10); //результат 3010

        //trim() method eliminates leading and trailing spaces
        String s3="  hello string   ";
        System.out.println("1"+s3.trim()+"1");
    }
}
