package homwork.homework8;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Exeption {
    public static void main(String[] args) {
        try {
            run();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void run() throws ParseException, IOException, FileNotFoundException {

    }
}
