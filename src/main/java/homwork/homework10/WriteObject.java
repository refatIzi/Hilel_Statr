package homwork.homework10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {


        write_0ne();
        write_Two();

    }

    private static void write_0ne() {
        People people1 = new People(1, "BOB", 10);
        People people2 = new People(2, "MAX", 30);
        People people3 = new People(3, "NADIA", 26);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("people.bin"))) {
            outputStream.writeObject(people1);
            outputStream.writeObject(people2);
            outputStream.writeObject(people3);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static void write_Two() {

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("people_two.bin"))) {
            People[] people = {new People(1, "BOB", 10), new People(2, "MAX", 30), new People(3, "NADIA", 26)};
            outputStream.writeObject(people);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
