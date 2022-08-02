package alishev;
import java.util.Scanner;
public class Scaner_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write your name");
        String name =scanner.nextLine();
        System.out.println("how old are you? ");
        String old =scanner.nextLine();
        System.out.println("Your name "+name+" yor are "+old+" years old");
        System.out.println("Do you want to study JAVA write yes or no");
        System.out.println("I am waiting for your answer ");
        String yes_no =scanner.nextLine();
        System.out.println("your answer "+yes_no);
        System.out.println("how years have you been studying java?");
        int study =scanner.nextInt();
        System.out.println("you study java "+study+" years");
        System.out.println("Good by "+name);
        /**Примечание ранше не оброшал на это
         *  при написании scanner.nextInt(); вище scanner.nextLine(); и scanner.nextLine(); не считываються
         * и программа переходит на следуюший scanner.nextLine();
         * НАШОЛ РЕШЕНИЕ В ИНЕТРЕНЕТЕ
         * Сама проблема заключается в том, что scanner.nextInt() считывает не всю строку,
         * а лишь число, оставляя в буфере \n, который и принимает следующий scanner.nextLine().
         * Чтобы решить эту проблему, можно, например вызвать холостой scanner.nextLine() перед основным рабочим телом Вашей программы.*/

    }
}
