package hillel;

public class Myclass {
    public static void main(String[] args) {
        ///             1                  2              3
        String AAA="((5+3)*(6-4)) / ((10-1)/(5-2)) * ((7-3)*(8/2))";
        String input = "(Hi,X)*(How-how are)/(any you?)";
        //String[] parts = AAA.split("\\)+\s+[/*]+\s+\\(");
        String[] parts = AAA.split("\s+[/*]+\s");

        for (String a:parts){
            System.out.println(a+" "+AAA.indexOf(" / ")+" "+AAA.indexOf(" * "));
        }
        String atr="(5+3)*(6-4)*(3-1)";
        String[] arr=atr.split("\\*");
        int c=0;
        int k=1;
       for (String a:arr){
           String ssd=a.replace("(","").replace(")","");
           if(ssd.contains("+")){
               String[]sum=ssd.split("\\+");
               c=Integer.parseInt(sum[0])+Integer.parseInt(sum[1]);
              // System.out.println("+");
           }
           if(ssd.contains("-")){
               String[]sum=ssd.split("\\-");
               c=Integer.parseInt(sum[0])-Integer.parseInt(sum[1]);
              // System.out.println("+");
           }
          //  String[]sum=a.replace("(","").replace(")","").split("\\+");
           // c=Integer.parseInt(sum[0])+Integer.parseInt(sum[1]);
            k=k*c;
       }
        System.out.println(k);
    }

}
