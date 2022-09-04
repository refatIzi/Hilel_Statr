package homwork.homwork9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("./myfile.txt");
        PrintWriter printWriter=new PrintWriter(file);
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        System.out.println(str);
        printWriter.println(str);
        printWriter.close();
        Scanner readFile=new Scanner(file);
        while (readFile.hasNextLine()){
            System.out.println(readFile.nextLine());
        }
    }
}
