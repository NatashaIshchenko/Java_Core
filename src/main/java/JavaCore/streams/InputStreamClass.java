package JavaCore.streams;

import java.io.*;

/**
 * InputStream - считываем инфу из файла
 */
public class InputStreamClass {

    static String input_file1 = "src/main/resources/input_file1.txt";

    public static void main(String[] args) throws IOException {
        //fileInputStreamFunc();
        //bufferedInputStreamFunc();
        //dataInputStreamFunc();
        //fileReaderFunc();
        //bufferedReaderFunc();
        //inputStreamReaderFunc();
        stringReaderFunc();
    }

    /**
     * FileInputStream class obtains input bytes from a file
     */
    private static void fileInputStreamFunc() throws IOException {
            FileInputStream fin=new FileInputStream(input_file1);
            int i=0;
            while((i=fin.read())!=-1){
                System.out.print((char)i);
            }
            fin.close();
    }

    /**
     * BufferedInputStream class is used to read information from stream. It internally uses buffer mechanism to make the performance fast.
     */
    private static void bufferedInputStreamFunc() throws IOException {
            FileInputStream fin=new FileInputStream(input_file1);
            BufferedInputStream bin=new BufferedInputStream(fin);
            int i;
            while((i=bin.read())!=-1){
                System.out.print((char)i);
            }
            bin.close();
            fin.close();
    }

    /**
     * Java DataInputStream class allows an application to read primitive data from the input stream in a machine-independent way.
     * Java application generally uses the data output stream to write data that can later be read by a data input stream
     */
    private static void dataInputStreamFunc() throws IOException {
        InputStream input = new FileInputStream(input_file1);
        DataInputStream inst = new DataInputStream(input);
        int count = input.available();
        byte[] ary = new byte[count];
        inst.read(ary);
        for (byte bt : ary) {
            char k = (char) bt;
            System.out.print(k+"-");
        }
    }

    /**
     * Java FileReader class is used to read data from the file. It returns data in byte format like FileInputStream class.
     *
     * It is character-oriented class which is used for file handling in java.
     */
    private static void fileReaderFunc() throws IOException{
        FileReader fr=new FileReader(input_file1);
        int i;
        while((i=fr.read())!=-1)
            System.out.print((char)i);
        fr.close();
    }

    /**
     * Java BufferedReader class is used to read the text from a character-based input stream.
     * It can be used to read data line by line by readLine() method. It makes the performance fast.
     * It inherits Reader class.
     */
    private static void bufferedReaderFunc() throws IOException{
        FileReader r=new FileReader(input_file1);
        BufferedReader br=new BufferedReader(r);
        String str1=br.readLine();
        System.out.println("Result "+str1);
    }

    /**
     * An InputStreamReader is a bridge from byte streams to character streams:
     * It reads bytes and decodes them into characters using a specified charset.
     * The charset that it uses may be specified by name or may be given explicitly, or the platform's default charset may be accepted.
     */
    private static void inputStreamReaderFunc() throws IOException {
        InputStream stream = new FileInputStream(input_file1);
        Reader reader = new InputStreamReader(stream);
        int data = reader.read();
        while (data != -1) {
            System.out.print((char) data);
            data = reader.read();
        }
    }

    /**
     * Java StringReader class is a character stream with string as a source.
     * It takes an input string and changes it into character stream. It inherits Reader class.
     */
    private static void stringReaderFunc() throws IOException{
        String srg = "Hello Java!! \nWelcome to Javatpoint.";
        StringReader reader = new StringReader(srg);
        int k=0;
        while((k=reader.read())!=-1){
            System.out.print((char)k);
        }
    }
}



