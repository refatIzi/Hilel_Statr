package calculation;

public class ldd {
    public static void main(String[] args) {


        String loginToken = "[wdsd34svdf]";
        loginToken=loginToken.substring( 1, loginToken.length() - 1 );
        System.out.println( loginToken );
       // divide("252/7/6/2");
        //String out = "(((400+2)-(2*3))/((6-2)/(3-1))) ";
       // out=out.substring(0,0)+out.substring(1);
       // int l=out.length();
      /// out=out.substring(0,l-2)+out.substring(l-1);
       //System.out.println( out);

       // System.out.println( out.substring(0,l-2)+out.substring(l-1));
    }
    public static void divide(String art){
        int adding = 0;
        String[] arr_num = art.split("\\/");
        for (int i = 0; i < arr_num.length; i++) {
            if (i != arr_num.length - 1) {
                int start = Integer.parseInt(arr_num[i]);
                int end = Integer.parseInt(arr_num[i + 1]);
                System.out.println(arr_num[i] + " " + arr_num[i + 1]);
                end = start / end;
                arr_num[i + 1] = String.valueOf(end);
            }
            if (i == arr_num.length - 1) adding = Integer.parseInt(arr_num[i]);
        }
        System.out.println(adding);
    }
    public String calculation(String atr) {
        /**мы дожны разбить строку до момента когда встречаеться большое количество повторяюшихся скобкок после знака * или / это
         * будет середина то есть eще скобки [\(\)] перед  * или /  до болшого скопления ( */
        String[] parts = atr.split("[\\(\\)]");
        String calculation = null;
        String result = null;
        int k = 0;
        System.out.println(atr);
        for (int i = 0; i < parts.length; i++) {
            System.out.println(k + " " + parts[i]);
            if (!parts[i].equals("")) {
                if (parts[i].contains("+") || parts[i].contains("-")) {
                    //System.out.println(s);
                    //calculation = operationPM(s);
                } else {
                    //System.out.println("operation [*/] " + s);
                    //if (s.contains("*")) result = add(calculation + s);
                    //if (s.contains("/")) result = divide(calculation + s);
                }

            }
            k++;
        }
        return result;
    }

}
