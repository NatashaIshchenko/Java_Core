package JavaCore.streams;

import java.io.*;

/**
 * OutputStream - записываем инфу в класс
 */
public class OutputStreamClass {

    static String  output_file1 = "src/main/resources/output_file1.txt";

    public static void main(String[] args) throws IOException{
        //fileOutputStreamFunc();
        //bufferedOutputStreamFunc();
        //dataOutputStreamFunc();
        //fileWriterFunc();
        //bufferedWriterFunc();
        //printStreamFunc();
        outputStreamWriterFunc();
    }

    /**
     * FileOutputStream is an output stream used for writing data to a file
     */
    private static void fileOutputStreamFunc() throws IOException{
            FileOutputStream fout=new FileOutputStream(output_file1);
            String s="Good day. fileOutputStreamFunc()";
            byte b[]=s.getBytes();//converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("success...");
    }

    /**
     * Java BufferedOutputStream class is used for buffering an output stream.
     * It internally uses buffer to store data. It adds more efficiency than to write data directly into a stream.
     * So, it makes the performance fast.
     */
    private static void bufferedOutputStreamFunc() throws IOException {
        FileOutputStream fout=new FileOutputStream(output_file1);
        BufferedOutputStream bout=new BufferedOutputStream(fout);
        String s="Good day. bufferedOutputStreamFunc()";
        byte b[]=s.getBytes();
        bout.write(b); //It writes the specified byte to the buffered output stream
        //It flushes the buffered output stream
        //The flush() flushes the data of one stream and send it into another. It is required if you have connected the one stream with another.
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("success");
    }

    /**
     * Java DataOutputStream class allows an application to write primitive Java data types to the output stream in a machine-independent way
     */
    private static void dataOutputStreamFunc() throws IOException {
        FileOutputStream file = new FileOutputStream(output_file1);
        DataOutputStream data = new DataOutputStream(file);
        data.writeInt(65);
        data.flush();
        data.close();
        System.out.println("Success...");
    }

    /**
     * Java FileWriter class is used to write character-oriented data to a file.
     * It is character-oriented class which is used for file handling in java.
     *
     * Unlike FileOutputStream class, you don't need to convert string into byte array because it provides method to write string directly.
     */
    private static void fileWriterFunc() throws IOException{
        FileWriter fw=new FileWriter(output_file1);
        fw.write("Good day. fileWriterFunc()");
        fw.close();
    }

    /**
     * Java BufferedWriter class is used to provide buffering for Writer instances.
     * It makes the performance fast. It inherits Writer class.
     * The buffering characters are used for providing the efficient writing of single arrays, characters, and strings.
     */
    private static void bufferedWriterFunc() throws IOException{
        FileWriter writer = new FileWriter(output_file1);
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write("Good day. bufferedWriterFunc()");
        buffer.close();
        System.out.println("Success");
    }

    /**
     * The PrintStream class provides methods to write data to another stream.
     * The PrintStream class automatically flushes the data so there is no need to call flush() method.
     * Moreover, its methods don't throw IOException
     */
    private static void printStreamFunc() throws IOException{
        FileOutputStream fout=new FileOutputStream(output_file1);
        PrintStream pout=new PrintStream(fout);
        pout.println(2018);
        pout.println("Hello Java");
        pout.println("Welcome to Java");
        pout.printf("%d",30);
        pout.close();
        fout.close();
        System.out.println("Success");
    }

    /**
     * OutputStreamWriter is a class which is used to convert character stream to byte stream,
     * the characters are encoded into byte using a specified charset.
     * write() method calls the encoding converter which converts the character into bytes.
     * The resulting bytes are then accumulated in a buffer before being written into the underlying output stream.
     * The characters passed to write() methods are not buffered.
     * We optimize the performance of OutputStreamWriter by using it with in a BufferedWriter so that to avoid frequent converter invocation.
     */
    private static void outputStreamWriterFunc() throws IOException{
        OutputStream outputStream = new FileOutputStream(output_file1);
        Writer outputStreamWriter = new OutputStreamWriter(outputStream);
        outputStreamWriter.write("Hello World");
        outputStreamWriter.close();
    }
}

