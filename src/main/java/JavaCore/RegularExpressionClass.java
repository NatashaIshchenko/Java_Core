package JavaCore;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * регулярные выражения
 *
 * Для работы с регулярными выражениями в Java представлен пакет java.util.regex.
 * Пакет содержит два класса - Pattern и Matcher, которые работают вместе.
 * Класс Patern применяется для задания регулярного выражения.
 * Класс Matcher сопоставляет шаблон с последовательностью символов.
 * Ни Pattern ни Matcher не имеют конструкторов, мы создаем их с помощью методов класса Pattern.
 *
 * https://regex101.com/ - regular expression online
 *
 */
public class RegularExpressionClass {

    public static void main(String[] args){
        regularExpressionFunc();
    }

    public static void regularExpressionFunc(){
        String text = "hello";
        //создаем паттерн регулярного выражения
        String pattern = "[a-z]+";
        Pattern p = Pattern.compile(pattern);
        //проверяем на соответствие регулярному выражению
        Matcher m = p.matcher(text);
        System.out.println("match result = " + m.matches());
    }
}