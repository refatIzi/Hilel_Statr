package homwork.homework7;

import hillel.MyScanner_;

import java.io.IOException;

public class Arithmetics {
    public static void main(String[] args) throws IOException {
        MyScanner_ scanner = new MyScanner_(System.in);
        String command;
        int a;
        int b;
        boolean status = false;
        while (true) {
            if (status == true) break;
            try {
                System.out.println("Введите два числа:");
                System.out.println("Введите первое чилос:");
                a = scanner.nextInt();
                System.out.println("Введите второе чилос:");
                b = scanner.nextInt();
                help();
                command = scanner.nextLine();
                switch (command) {
                    case "a":
                        System.out.println(Calculation.add(a, b));
                        break;
                    case "d":
                        System.out.println(Calculation.divide(a, b));
                        break;
                    case "m":
                        System.out.println(Calculation.multi(a, b));
                        break;
                    case "s":
                        System.out.println(Calculation.sub(a, b));
                        break;
                    case "q":
                        status = true;
                        System.out.println("Досвидание!!!!!!!!!");
                        break;
                    default:
                        System.out.println("Вы ввели что то другое");

                }
            } catch (Exception e) {
                System.out.println("Введите число");
                scanner.next();
            }
        }
    }

    public static void help() {
        System.out.println("Для того чтобы умножить два числа введите 'm'\n" + "Для того чтобы разделить два числа введите 'd'\n" + "Для того чтобы сложить два числа введите 'a'\n" + "Для того чтобы вычесть два числа введите 's'\n" + "Для выхода из системы введите 'q'");
    }
}
