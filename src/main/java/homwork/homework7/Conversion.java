package homwork.homework7;

import hillel.MyScanner_;

import java.io.IOException;

public class Conversion {
    public static void main(String[] args) throws IOException {
        MyScanner_ scanner = new MyScanner_(System.in);
        System.out.println("Введите сумму денег:");
        int a = scanner.nextInt();
        System.out.println("Введите курс для конвертации:");
        double b = scanner.nextDouble();
        System.out.println("Конвертировананя валюта " + convert(a, b));

    }

    public static double convert(int a, double b) {
        return (a / b);
    }
}