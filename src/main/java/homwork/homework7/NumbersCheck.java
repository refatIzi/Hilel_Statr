package homwork.homework7;

import hillel.MyScanner;

import java.io.IOException;

public class NumbersCheck {
    public static void main(String[] args) throws IOException {
        MyScanner scanner = new MyScanner(System.in);
        int stat;
        boolean check = true;
        System.out.println("Введите число:");
        int a = scanner.nextInt();
        if (a > 0) System.out.println("Положительное число");
        for (int i = 2; i <= a / 2; i++) {
            stat = a % i;
            if (stat == 0) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println(a + " простое число");
        } else {
            System.out.println(a + " не простое число");
        }
    }
}
