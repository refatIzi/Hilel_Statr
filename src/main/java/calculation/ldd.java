package calculation;

public class ldd {
    public static void main(String[] args) {

       // divide("252/7/6/2");
        String out = "(((400+2)-(2*3))/((6-2)/(3-1))) ";
        out=out.substring(0,0)+out.substring(1);
        int l=out.length();
        out=out.substring(0,l-2)+out.substring(l-1);
       System.out.println( out);

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
}
