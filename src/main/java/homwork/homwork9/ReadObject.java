package homwork.homwork9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream=new FileInputStream("people.bin");
            ObjectInputStream inputStream=new ObjectInputStream(fileInputStream);
            People people1=(People) inputStream.readObject();
            People people2=(People) inputStream.readObject();
            People people3=(People) inputStream.readObject();
            System.out.println(people1);
            System.out.println(people2);
            System.out.println(people3);


        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
