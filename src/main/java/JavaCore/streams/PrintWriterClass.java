package JavaCore.streams;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Java PrintWriter class is the implementation of Writer class.
 * It is used to print the formatted representation of objects to the text-output stream.
 */
public class PrintWriterClass {

    static String input_file1 = "src/main/resources/input_file1.txt";

    public static void main(String[] args) throws Exception{
        dataToConsoleFunc();
        dataToFileFunc();
    }

    /**
     * запись данных в System.out
     */
    private static void dataToConsoleFunc() throws IOException {
        //Data to write on Console using PrintWriter
        PrintWriter writer = new PrintWriter(System.out);
        writer.write("Javatpoint provides tutorials of all technology.");
        writer.write(" additional string1");
        writer.println(" additional string2");
        writer.flush();
        writer.close();
    }

    /**
     *  запись данных в файл
     */
    private static void dataToFileFunc() throws IOException {
        PrintWriter writer = new PrintWriter(new File(input_file1));
        writer.write("Like Java, Spring, Hibernate, Android, PHP etc.");
        writer.println(" additional string ");
        writer.flush();
        writer.close();
    }
}
