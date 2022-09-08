package homwork.homework8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class Exeption {
    public static void main(String[] args) {
        try {
            run("string.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден "+e);
        }
    }
    public static void run(String dir) throws FileNotFoundException {
        File file=new File(dir);
        Scanner scanner=new Scanner(file);
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }

    }
}
