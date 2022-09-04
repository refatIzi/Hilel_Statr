package homwork.homwork9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        People people1=new People(1,"BOB");
        People people2=new People(2,"MAX");
        People people3=new People(3,"NADIA");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("people.bin");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(people1);
            outputStream.writeObject(people2);
            outputStream.writeObject(people3);
            outputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
