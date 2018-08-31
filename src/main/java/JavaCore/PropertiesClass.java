package JavaCore;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Properties;

/**
 * Property file - это текстовый файл, в котором хранятся настройки системы (хранятся системные вары, т.е. переменные) в следующем формате:
 * key = value
 * пример:
 * login = aa
 * password = bb
 * Для работы с Property file в Java есть класс Properties
 */
public class PropertiesClass {

    public static void main(String[] args){
        String key1_value = getPropertiesFile().getProperty("key1");
        System.out.println("value of key1 = " + key1_value);
    }

    /**
     * Получение пропертей в UTF-8 формате из файла property_file1.properties
     */
    private static Properties getPropertiesFile() {
        String propertiePath = "src/main/resources/property_file1.properties";
        Properties prop = new Properties();
        try {
            FileInputStream fis = new FileInputStream(new File(propertiePath));
            prop.load(new InputStreamReader(fis, Charset.forName("UTF-8")));
        } catch (IOException e) {
            throw new Error("Property file not found");
        }
        return prop;
    }
}
