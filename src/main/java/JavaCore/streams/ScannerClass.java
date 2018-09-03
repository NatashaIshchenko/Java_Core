package JavaCore.streams;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Java Scanner class is widely used to parse text for string and primitive types using a regular expression.
 *
 * Java Scanner class extends Object class and implements Iterator and Closeable interfaces.
 */
public class ScannerClass {

    public static void main(String[] args) throws IOException {
        //scannerConsoleInputFunc();
        //inputDataFromString();
        inputDataFromFile();
    }

    /**
     * вывод данных введенных с клавиатуры
     */
    private static void scannerConsoleInputFunc(){
        //в конструторе указываем откуда считываь
        Scanner scanner = new Scanner(System.in);
        String line;
        for(int i=1; i<=3; i++){
            System.out.println("Input line #" + i + ": ");
            line = scanner.nextLine();
            System.out.println("Result line: " + line);
        }

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
        System.out.println("Name: " + name);
        System.out.print("Enter your age: ");
        int i = in.nextInt();
        System.out.println("Age: " + i);
        System.out.print("Enter your salary: ");
        double d = in.nextDouble();
        System.out.println("Salary: " + d);
        in.close();
    }

    /**
     * вывод данных из String c указанием собственного Delimiter
     */
    private static void inputDataFromString(){
        String str = "Hello/This is JavaTpoint/My name is Abhishek.";
        //Create scanner with the specified String Object
        Scanner scanner = new Scanner(str);
        System.out.println("Boolean Result: "+scanner.hasNextBoolean());
        //Change the delimiter of this scanner
        scanner.useDelimiter("/");
        //Printing the tokenized Strings
        System.out.println("---Tokenizes String---");
        while(scanner.hasNext()){
            System.out.println(scanner.next());
        }
        //Display the new delimiter
        System.out.println("Delimiter used: " +scanner.delimiter());
        scanner.close();
    }

    /**
     * вывод данных из файла
     */
    private static void inputDataFromFile() throws IOException{
        String input_file1 = "src/main/resources/input_file1.txt";
        Scanner scanner = new Scanner(new File(input_file1));
        while(scanner.hasNext()){
            System.out.println(scanner.next());
        }
    }
}