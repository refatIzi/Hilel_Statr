package calculation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ldd {
    public static void main(String[] args) {
        /*  Integer a = 10;
        Integer b = 10;
        System.out.println(a.equals(b));


        String aa = new String("AA");
        String bb = new String("AA");
        System.out.println("sad");

        System.out.println(aa == bb);
*/
        String calculation = "80-10-5)+(10-5)";//[\d()*/+-]*  пулл строк [0-9]*\\)(.*)\\([0-9]*"
       // Matcher m = Pattern.compile("\\([0-9]*[*\\/+-]*[0-9]\\)[*\\/+-]*\\([0-9]*[*\\/+-]*[0-9]\\)").matcher(calculation);
        Matcher m = Pattern.compile("\\)[*\\/+-]*").matcher(calculation);

        if(m.find())
        System.out.println(m.group(2));
        else System.out.println("NO");
        // System.out.println(calculation.contains(")*-"));
      //  System.out.println(calculation.matches("[\\d()/-]*"));
      //  System.out.println(calculation.matches("[\\d()*-]*"));
        //String calculation2 = "(-(10-5)*2)";//[\d()*/+-]*  пулл строк
        ///(?=(?:\(.*\)|\[.*\]|<.*>|\{.*\}|[0-9a-f]*)$)^[\[{(<]?[0-9a-f]{32}[\]}>)]?$/i
        //System.out.println(calculation2.matches("[\\d-()/[0-9]]*"));
        //System.out.println(calculation2.matches("[\\d-()*[0-9]]*"));

        //System.out.println(calculation2.matches("(?=(?:(.*)))"));
        //  System.out.println(calculation2.matches("^[\\d-()/[0-9]]*"));
        //System.out.println(calculation2.matches("[\\d-()*[0-9]]*"));

      //  System.out.println(calculation2.matches("[\\d()/-[0-9]]*"));
      //  System.out.println(calculation2.matches("[\\d()*-[0-9]]*"));


        String r = "http://www.regex101.com";
      //  System.out.println(r.matches("http://w{3}\\..+\\.(com)"));
        //System.out.println(Integer.parseInt("-"+"6"));
        //System.out.println(operationPM("20.0+67"));
        // System.out.println(multi("-5*9"));
        // String loginToken = "[wdsd34svdf]";
        // loginToken=loginToken.substring( 1, loginToken.length() - 1 );
        //System.out.println( loginToken );
        // divide("252/7/6/2");
        //String out = "(((400+2)-(2*3))/((6-2)/(3-1))) ";
        // out=out.substring(0,0)+out.substring(1);
        // int l=out.length();
        /// out=out.substring(0,l-2)+out.substring(l-1);
        //System.out.println( out);

        // System.out.println( out.substring(0,l-2)+out.substring(l-1));
    }

    public static void divide(String art) {
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

    private static String multi(String art) {
        System.out.println("Multi " + art);
        double adding = 0;
        String[] arr_num = art.split("\\*");
        for (int i = 0; i < arr_num.length; i++) {
            if (i != arr_num.length - 1) {
                double start = Double.parseDouble(arr_num[i]);
                double end = Double.parseDouble(arr_num[i + 1]);
                System.out.println(arr_num[i] + " " + arr_num[i + 1]);
                end = start * end;
                arr_num[i + 1] = String.valueOf(end);
            }
            if (i == arr_num.length - 1) adding = Double.parseDouble(arr_num[i]);
        }
        System.out.println("multi answer " + adding);
        return String.valueOf(adding);
    }
    /**
     * Метод сложения и вычитания выпольнин в одном виде
     */
    /**
     * Метод сложения и вычитания выпольнин в одном виде
     */
    private static String operationPM(String art) {
        System.out.println("OperationPM " + art);
        /**Тут я обвявляю два массива в первый  массив я записываю числа во второй  знаки + или - для понимания когда мне производить операцию*/
        String[] arr_num = art.split("[\\+\\-]");// тут мы разбили массив на числа
        String[] pl_mn = art.replaceAll("[0.0-9]+", ",").split(",");// тут мы удалаем чиала и в место них записываем [,]
        // но так как число начинаеться с начала то у анс первая будет запитая ,+,+,-,+,- как то так
        // то есть в 0 ячейку маасива записываеться пустота и првоерка на + или - начинаем с 1 ячейки
        /**Обратите внимание что В первый элемент массива записываеться пустота а потом + или - */


        //54+4+6-3-1
        //54 4 6 3 1
        double SM = 0;
        int k = 1;
        int i;
        /**по факту 0 элемент массиыва должен быть пустым pl_mn но если перед цийрой стоит знак + или -
         * к примеру -5+9 то условие не выполняеться  так как в парсе в масси arr_num в 0 элемент поподает пустота ("") и выдает
         * ошибку For input string: "" иззи точго что перед (-) нет ничего*/
        boolean starMinusPlus = false;
        if (pl_mn[0].contains("-") || pl_mn[0].contains("+")) {
            starMinusPlus = true;
            i = 1;
        } else {
            i = 0;
        }
        for (; i < arr_num.length; i++) {

            if (i != arr_num.length - 1) {
                double start;
                start = Double.parseDouble(arr_num[i]);
                if (starMinusPlus == true) {
                    start = Double.parseDouble(pl_mn[0] + start);
                    starMinusPlus = false;
                }

                double end = Double.parseDouble(arr_num[i + 1]);

                if (pl_mn[k].equals("+")) {
                    System.out.println(start + " " + pl_mn[k] + " " + end);
                    end = start + end;
                    arr_num[i + 1] = String.valueOf(end);
                }
                if (pl_mn[k].equals("-")) {
                    System.out.println(start + " " + pl_mn[k] + " " + end);
                    end = start - end;
                    arr_num[i + 1] = String.valueOf(end);
                }
            }
            if (i == arr_num.length - 1) SM = Double.parseDouble(arr_num[i]);
            k++;
        }
        System.out.println("OperationPM answer " + SM);
        return String.valueOf(SM);
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
