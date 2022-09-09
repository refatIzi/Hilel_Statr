package homwork.homework8;

import java.util.Scanner;

public class Exeption_second {
    public static void main(String[] args) throws Exceptiona_Show {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int number=scanner.nextInt();
            if(number!=0){
                throw new Exceptiona_Show("Смотри что вводишь");
            }
        }
    }
}
