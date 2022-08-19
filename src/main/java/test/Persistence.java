package test;

public class Persistence {
    public static void main(String[] args) {
        /** Write a function, persistence, that takes in a positive parameter
         * num and returns its multiplicative persistence,
         * which is the number of times you must multiply the digits in num until you reach a single digit.
         * For example (Input --> Output):
         * 39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit)
         * 999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2)
         * 25 --> 2 (because 2*5 = 10, 1*0 = 0)
         * 4 --> 0 (because 4 is already a one-digit number)
         */
        System.out.println(Persist.persistence(946));
        System.out.println(Persist.persistence(4));
        System.out.println(Persist.persistence(25));
        System.out.println(Persist.persistence(999623));
    }

    public static void persistence(String s) {
        char[] arr = s.toCharArray();
        int num = 1;
        for (int i = 0; i < arr.length; i++) {
            num = num * Integer.parseInt(String.valueOf(arr[i]));
        }
        if (arr.length!=1) {
            System.out.println(num);
            persistence(String.valueOf(num));
        } else System.out.println("finally "+num);


    }
    public  static int  s=0;
    public static int persistence(int n){
        perst(n);
        return s;
    }
    public static void perst(long n){
        char[] arr = String.valueOf(n).toCharArray();
        int num = 1;
        for (int i = 0; i < arr.length; i++) {
            num = num * Integer.parseInt(String.valueOf(arr[i]));
        }
        if (arr.length!=1) {
            //System.out.println(num);
            perst((num));
        }
        else s=num;
    }



    public static int persistence(long n) {
        int counter = 1;
        int vout = 1;
        if (n < 9) {
            return 0;
        } else {
            int[] array = new int[String.valueOf(n).length()];
            for (int i = array.length - 1; i >= 0; i--) {
                array[i] = (int) n % 10;
                n /= 10;
            }
            for (int q = 0; q < array.length; q++) {
                counter *= array[q];
            }
            while (true) {
                if (counter > 9) {
                    int[] array2 = new int[String.valueOf(counter).length()];
                    for (int i = array2.length - 1; i >= 0; i--) {
                        array2[i] = counter % 10;
                        counter /= 10;
                    }
                    counter = 1;

                    for (int q = 0; q < array2.length; q++) {
                        counter *= array2[q];
                    }
                    vout++;
                } else break;
            }
        }
        return vout;
    }
}
