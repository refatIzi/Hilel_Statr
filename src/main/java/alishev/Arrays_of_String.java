package alishev;

import hillel.MyScanner;

import java.io.IOException;
import java.util.Random;

public class Arrays_of_String {
    public static void main(String[] args) throws IOException {

        System.out.println("Menu breakfast");
        String[] sandwich = {"Колбоса, Сир и помидор", "Курица, Сир и помидор с луком", "Говядина, Сир и помидор c агурцами"};

        for (int i = 0; i < 3; i++) {
            System.out.println(i + 1 + " " + sandwich[i]);
        }

        System.out.println("Виберите из меню состав сендвича нажав номер состава");

        MyScanner myScanner_ = new MyScanner(System.in);

        int check = myScanner_.nextInt() - 1;

        String[] array = {"Яблоко", "Апельсин", "Груша", "Виноград", "Абрикос"};
        System.out.println("Набор фруктов для сока");
        //for each
        for (String string : array) System.out.println(string);
        String fresh = "";
        for (int i = 0; i < 2; i++) {
            int number = new Random().nextInt(5);
            fresh = fresh + " " + array[number];
        }

        String eat = "Сегодня у Вас на зватрок напиток из" + fresh + " и сендвичь с " + sandwich[check];
        System.out.println(eat);

    }
}
