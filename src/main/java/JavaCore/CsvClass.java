package JavaCore;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.File;
import java.util.Iterator;
import java.util.Scanner;

/**
 * CSV - A Comma-Separated Values (CSV) file is just a normal plain-text file,
 * store data in column by column, and split it by a separator (e.g normally it is a comma “,”).
 *
 * Parser is a compiler that is used to break the data into smaller elements coming from lexical analysis phase.
 */
public class CsvClass {

    public static void main(String[] args) throws Exception{
        String csv_file1 = "src/main/resources/csv_file1.csv";
        Scanner scanner = new Scanner(new File(csv_file1));
        CSVParser per;
        int count = 1;
        while (scanner.hasNext()) {
            per = CSVParser.parse(scanner.nextLine(), CSVFormat.DEFAULT); //так можно парсить срзу весь файл
            Iterator<CSVRecord> table = per.iterator();
            System.out.println(count+":");
            while (table.hasNext()) {
                CSVRecord entry = table.next();
                System.out.println(entry);
                System.out.println("количество values: "+entry.size());
                System.out.println("first element = "+entry.get(0));
            }
            count++;
        }
    }
}


