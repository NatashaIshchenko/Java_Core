package JavaCore.streams;

import java.io.File;
import java.io.IOException;

public class FileClass {

    public static void main(String[] args) throws IOException {
        try {
            File file = new File("src/main/resources/test_file.txt");
            if (file.createNewFile()) {
                System.out.println("New File is created!");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
