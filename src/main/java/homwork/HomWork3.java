package homwork;

import hillel.MyScanner_;

import java.io.IOException;
import java.util.Scanner;

public class HomWork3 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        //MyScanner_ scanner = new MyScanner_(System.in);
        System.out.println("Введите целое число");
        int a = scanner.nextInt();
        System.out.println("Введите дробное число");
        double b = scanner.nextDouble();
        System.out.println("Введите Ваше имя");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println(name);
        System.out.printf("Привет %1$s! %n%1$s, Ти ввел Целое число %2$s! и Дробное %3$ 01.5f" +
                " %n Сумма єтих чисел равна %4$+01.5f %n Деление єтих чисел равна %5$ 01.5f", name, a, b, a + b,a/b);
    }
}
