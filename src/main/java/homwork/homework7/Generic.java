package homwork.homework7;

import java.util.ArrayList;
import java.util.List;

public class Generic {
    public static void main(String[] args) {

        String[] arr = new String[]{"Sirius", "Arcturus", "Altair", "Aldebaran", "Rigel", "Betelgeuse"};
        List<String> stars = new ArrayList<>();
        for (String s : arr) {
            stars.add(s);
        }
        System.out.println(stars);
    }
}
