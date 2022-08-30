package homwork.homework8;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(9));
    }
    private static int factorial(int factorial) {

        int res = 1;
        if (factorial == 1 || factorial == 0) {
            return res;
        }
        res = factorial * factorial(factorial-1);
        System.out.println(factorial+" "+res);
        return res;

    }
}
