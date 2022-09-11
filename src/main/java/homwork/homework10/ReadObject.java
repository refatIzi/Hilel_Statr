package homwork.homework10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {


        read_One();
        read_Two();

    }

    private static void read_One() {

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("people.bin"))) {
            People people1 = (People) inputStream.readObject();
            People people2 = (People) inputStream.readObject();
            People people3 = (People) inputStream.readObject();
            System.out.println(people1);
            System.out.println(people2);
            System.out.println(people3);

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    private static void read_Two() {

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("people_two.bin"))) {
            People[] people = (People[]) inputStream.readObject();
            System.out.println(Arrays.toString(people));
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
