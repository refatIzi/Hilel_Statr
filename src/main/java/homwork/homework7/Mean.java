package homwork.homework7;

import calculation.Calculation;
import hillel.MyScanner_;

import java.io.IOException;

public class Mean {
    public static void main(String[] args) throws IOException {
        MyScanner_ scanner = new MyScanner_(System.in);

        System.out.println("Введите первое чилос:");
        int a = scanner.nextInt();
        System.out.println("Введите второе чилос:");
        int b = scanner.nextInt();
        System.out.println("Введите третее чилос:");
        int c = scanner.nextInt();
        System.out.println("Среднее Арифметическое равно = " + Calcualtion.mean(a, b, c));

    }
}

class Calcualtion {
    public static double mean(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }
}