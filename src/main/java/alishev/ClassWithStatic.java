package alishev;

public class ClassWithStatic {
    public static void main(String[] args) {
        String atr = "["+Mathematics.math("(5+3)*(6-4)*(3-1)")+"]";
        System.out.printf("Это число PI равна %1s, а задача с примера (5+3)*(6-4)*(3-1) равна %2s",Mathematics.PI,atr);
    }
}

class Mathematics {
    public static final double PI=3.14159265359;
    private String atr;

    public Mathematics(String atr) {
        this.atr = atr;
    }

    public static int math(String atr) {
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
        return  k;
    }

}