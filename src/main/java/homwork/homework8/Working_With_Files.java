package homwork.homework8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Working_With_Files {
    public static void main(String[] args) throws FileNotFoundException {
        File fileName = new File("./index.html");
        Scanner scanner = new Scanner(fileName);
        String str="";
        while (scanner.hasNextLine()) {
           str=str+ scanner.nextLine()+"\n";
        }
        System.out.println(str);
        scanner.close();
    }
}
