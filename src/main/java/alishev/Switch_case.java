package alishev;

import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Take a fruit");
        int Number=scanner.nextInt();
        switch (Number){
            case 0:
                System.out.println("You Take an Apple");
                break;
            case 1:
                System.out.println("You Take an Apricot");
                break;
            case 2:
                System.out.println("You Take an Avocado");
                break;
            case 3:
                System.out.println("You Take a Banana");
                break;
            case 4:
                System.out.println("You Take a Bilberry");
                break;
            case 5:
                System.out.println("You Take a Kiwifruit");
                break;


        }
    }
}
