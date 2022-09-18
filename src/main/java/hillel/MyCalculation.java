package hillel;

import java.io.IOException;

public class MyCalculation {
    public static void main(String[] args) throws IOException {

        MyScanner scanner = new MyScanner(System.in);
        System.out.println("Пожалуйста введите два числа");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println("Введите строку ");
        String str=scanner.nextLine();
        System.out.println("Введите еще строку ");
        String tr=scanner.next();
        System.out.println("Ви ввели числа " + a + " " + b);
        System.out.println("Умножение " + (a * b) + " Деление " + ((float) a / (float) b) + " Вичитание " + (a - b) + " Сложение " + (a + b));
        System.out.println("Сложение последних двух чисел " + (c + d));
        System.out.println("STR "+str);
        System.out.println("TR "+tr);

        /**Разница между next и  nextLine() в том что  Метод next() принимать значение после, когда есть пустой символ, пробел, введен Enter
         * а  nextLine() пока не будет введен Enter */
    }
}
