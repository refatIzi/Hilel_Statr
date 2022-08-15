package alishev;

public class ClassWithStatic {
    public static void main(String[] args) {
        String atr = Mathematics.math("(5+3)*(6-4)*(3-1)");
        System.out.println(atr);
    }
}

class Mathematics {

    private String atr;

    public Mathematics(String atr) {
        this.atr = atr;
    }

    public static String math(String atr) {
        String[] arr = atr.split("\\*");
        int c = 0;
        int k = 1;
        for (String a : arr) {
            String ssd = a.replace("(", "").replace(")", "");
            if (ssd.contains("+")) {
                String[] sum = ssd.split("\\+");
                c = Integer.parseInt(sum[0]) + Integer.parseInt(sum[1]);
            }
            if (ssd.contains("-")) {
                String[] sum = ssd.split("\\-");
                c = Integer.parseInt(sum[0]) - Integer.parseInt(sum[1]);
            }

            k = k * c;
        }
        return "" + k;
    }

}