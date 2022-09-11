package homwork.homework8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Working_With_Files {
    public static void main(String[] args) throws FileNotFoundException {
        File fileName = new File("./string.txt");
        Scanner scanner = new Scanner(fileName);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
