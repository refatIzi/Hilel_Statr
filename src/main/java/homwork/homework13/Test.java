package homwork.homework13;

import hillel.MyScanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        MyScanner scanner=new MyScanner(System.in);
        //System.out.println("Create File\nto create file write the file format txt or doc or xml ");
        while (true){
            System.out.println("to create or open file write the file format txt or doc or xml ");
            String string=scanner.nextLine();
            if(string.equals("exit")){
                System.out.println("By");
                break;
            }
            else if(string.equals("txt")){
                System.out.println("Write name file. Example [String]");
                String name=scanner.nextLine();
               new TXTHandler(name,scanner);
            }
            else if(string.equals("doc")){
                System.out.println("Write name file. Example [String]");
                String name=scanner.nextLine();
                new DOCHandler(name,scanner);
            }
            else if(string.equals("xml")){
                System.out.println("Write name file. Example [String]");
                String name=scanner.nextLine();
                new XMLHandler(name,scanner);
            }
        }

    }

}
