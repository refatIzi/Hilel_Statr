package hillel;

public class Bytes {
    public static void main(String[] args) {
        byte a=13;
        byte b=11;

        System.out.println(b);
        String bin1 = String.format("%8s",Integer.toBinaryString(a)).replace(" ","0");
        String bin2 = String.format("%8s",Integer.toBinaryString(b)).replace(" ","0");
        System.out.println(bin1);
        System.out.println(bin2);
        int c= a&b;
        String bin3 =String.format("%8s",Integer.toBinaryString(c)).replace(" ","0");
                   //String.format("%8s", Integer.toBinaryString(octet)).replace(' ', '0');
        System.out.println(bin3);
        int d= a|b;
        String bin4 = String.format("%8s",Integer.toBinaryString(d)).replace(" ","0");
        System.out.println(bin4);
        int e= a^b;
        String bin5 = String.format("%8s",Integer.toBinaryString(e)).replace(" ","0");
        System.out.println(bin5);
        int f=~e;
        String bin6 = String.format("%8s",Integer.toBinaryString(f)).replace(" ","0");
        System.out.println(bin6);
        System.out.println(f);
        System.out.println((byte)253<<2);

    }
}
