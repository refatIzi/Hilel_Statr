package homwork.homework11;

import hillel.MyScanner;

import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Rect rectangle=new Rectangle();
        MyScanner scanner=new MyScanner(System.in);
        System.out.println("Write first Side and second Side");
        while (true){
            try {
                System.out.println("Write first side");
                double firstSide=scanner.nextDouble();
                System.out.println("Write second side");
                double secondSide=scanner.nextDouble();
                System.out.println("Area = "+rectangle.areaCalculator(firstSide,secondSide)+" Perimeter = "+rectangle.perimeterCalculator(firstSide,secondSide));
                System.out.println("If You want to close app write word or first Side and second Side ");
            }catch (Exception e){
                break;
            }
        }
    }
}
