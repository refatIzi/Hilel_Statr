package test;

class Persist {
    public static int s = 0;
    public static int persistence(long n) {
        s = 0;
        perst(n);
        return s;
    }
    public static void perst(long n) {
        char[] arr = String.valueOf(n).toCharArray();
        int num = 1;
        for (int i = 0; i < arr.length; i++) {
            num = num * Integer.parseInt(String.valueOf(arr[i]));
        }
        if (arr.length != 1) {
            s++;
            perst((num));

        }

    }
}