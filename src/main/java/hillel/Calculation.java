package hillel;

import java.io.IOException;
import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста введите два числа");
        int a=scanner.nextInt();
        int b=scanner.nextInt();

        System.out.println("Ви ввели числа "+a+" "+b);
        System.out.println("Умножение "+(a*b)+" Деление "+((float)a/(float)b)+" Вичитание "+(a-b)+" Сложение "+(a+b));
        /**Разница между next и  nextLine() в том что  Метод next() принимать значение после, когда есть пустой символ, пробел, введен Enter
         * а  nextLine() пока не будет введен Enter */
    }
}
