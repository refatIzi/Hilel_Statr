package homwork.homework10;

import java.util.Arrays;
import java.util.Scanner;

public class Feelings {

    public static void main(String[] args) {
        String[] array = new String[]{"anger", "awe", "joy", "love", "grief"};
        Scanner scanner = new Scanner(System.in);
        String string;
        while (scanner.hasNextLine()) {
            string = scanner.nextLine();
            if (string.equals("exit")) break;
            else check(string, array);
        }
    }

    public static void check(String str, String[] array) {
        //+" " + array[i]
        String feeling = "";
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            String s = set(array[i].toCharArray(), str.toCharArray());
            if (array[i].matches("[\\d" + s + "]*")) {
                feeling = feeling + " " + array[i];
                count++;
            }
        }
        System.out.println(str + " " + count + " feelings");
    }

    public static String set(char[] array, char[] word) {
        int k = 0;
        String s = "";
        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] == word[i] && k != array.length) {
                    s = s + array[j];
                    k++;
                }
            }
            if (k == array.length) break;
        }
        if (k < array.length) s = "";
        return s;
    }
}
