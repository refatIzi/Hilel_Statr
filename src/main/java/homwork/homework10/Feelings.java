package homwork.homework10;

import java.util.Scanner;

public class Feelings {
    String[] array = new String[]{"anger", "awe", "joy", "love", "grief"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        while (scanner.hasNextLine()) {
            string = scanner.nextLine();
            if (string.equals("exit")) break;
            else check(string);
        }
    }

    public static void check(String str) {

    }
}
