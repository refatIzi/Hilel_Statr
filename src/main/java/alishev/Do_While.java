package alishev;

import java.util.Scanner;

public class Do_While {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name;
        int years;
        boolean real;
        do{
            System.out.println("Write real name and years");
            name=scanner.nextLine();
            years=scanner.nextInt();
            scanner.nextLine();//холостой .nextLine();
            real =(years==25&&name.equals("Rifat"))?true:false;
            if(!real)  System.out.println("No real name and years");
            System.out.println(real);
        }while (!real);
        System.out.println("You write real name and years");

    }
}
