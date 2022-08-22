package hillel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Myclass {
    public static void main(String[] args) {
        ///             1                  2              3
        String AAA = "((5+3)*(6-4)) / ((10-1)/(5-2)) * ((7-3)*(8/2))";
        String input = "(Hi,X)*(How-how are)/(any you?)";
        //String[] parts = AAA.split("\\)+\s+[/*]+\s+\\(");
        String[] parts = AAA.split("\s+[/*]+\s");

        for (String a : parts) {
            //   System.out.println(a+" "+AAA.indexOf(" / ")+" "+AAA.indexOf(" * "));
        }
        //String atr="(5+3)*(6-4)*(3-1)";
        //  calculation("(5+3)*(6-4)*(3-1)");
        /** ) (( */
        // calculation("(5+3)*((6-4)*(3-1))");
        /** ) ((( */
        //calculation4("(5+3)*(((6-4)*2)/((3-1)*3))");
        /** )) ((( */ //       6/      2*3=6    6
        calculation4("(((5+3-2)*((4-2)*3))/6)/(((6-4)*2)/((3-1)*3))");
        //calculation3("with { braces left with braces } righ with both {   sdfsdfsdf sdfds sdf } without braces");

       // System.out.println(opertion("2+5-3+6"));
    }
    public static void calculation4(String atr) {
        /**мы дожны разбить строку до момента когда встречаеться большое количество повторяюшихся скобкок после знака * или / это
         * будет середина то есть ище скобки [\(\)] перед  * или /  до болшого скопления ( */
        //"[\\(\\)]+[*/]+(.)\\({2,}");
        String[] parts = atr.split("[\\(\\)]");

        for (String s : parts) {
            if (!s.equals("")) {
                System.out.println(s);
            }
        }
    }


    public static int opertion(String s){
        char [] a=s.toCharArray();
        int m=Integer.parseInt(String.valueOf(a[0]));
        for(int i=0;i<a.length;i++){
            if(a[i]=='+'){
          m=m+Integer.parseInt(String.valueOf(a[i+1]));
            }
            if(a[i]=='-'){
               // m=m-Integer.parseInt(String.valueOf(a[i+1]));
            }
        }
        return m;
    }
    public static void calculation(String atr) {
        /**мы дожны разбить строку до момента когда встречаеться большое количество повторяюшихся скобкок после знака * или / это
         * будет середина то есть ище скобки [\(\)] перед  * или /  до болшого скопления ( */
        //"[\\(\\)]+[*/]+(.)\\({2,}");
        int l=atr.indexOf("(");
        String[] parts = atr.split("\\/+\\({3,}");
        String a = "";
        int i=0;
        for (String s : parts) {
            if (!s.equals("")) {

                a += s;
                System.out.println(s);

            } else {
                a = i+" ";
            }
            i++;
        }


    }
    public static void calculation3(String args) {
        Pattern pattern = Pattern.compile("[\\{\\}]");
        Matcher matcher = pattern.matcher(args);
        int i=0;
        while (matcher.find()) {
            String[] line = args.substring(matcher.start(), matcher.end()).split(" ");
            System.out.println(args.substring(matcher.start(), matcher.end()));
            i++;
        }
    }
    public static void calculation2(String atr) {
        String[] arr = atr.split("\\*");
        int c = 0;
        int k = 1;
        for (String a : arr) {
            String ssd = a.replace("(", "").replace(")", "");
            if (ssd.contains("+")) {
                String[] sum = ssd.split("\\+");
                c = Integer.parseInt(sum[0]) + Integer.parseInt(sum[1]);
                // System.out.println("+");
            }
            if (ssd.contains("-")) {
                String[] sum = ssd.split("\\-");
                c = Integer.parseInt(sum[0]) - Integer.parseInt(sum[1]);
                // System.out.println("+");
            }
            //  String[]sum=a.replace("(","").replace(")","").split("\\+");
            // c=Integer.parseInt(sum[0])+Integer.parseInt(sum[1]);
            k = k * c;
        }
        System.out.println(k);
    }
}
