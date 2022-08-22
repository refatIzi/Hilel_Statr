package homwork.homework7;

public class Calculator {


    public static long divide(int a, int b) {
        int count = 0;
        if (a == 0 || b == 0) {
            System.out.println("На ноль делить нельзя");
            count = 0;
        } else {
            count = a / b;
        }
        return count;
    }

    public static long multi(int a, int b) {

        return a * b;
    }

    public static long add(int a, int b) {

        return a + b;
    }

    public static long sub(int a, int b) {

        return a - b;
    }

}
