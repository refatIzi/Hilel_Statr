package calculation;

import homwork.homework7.test.Animals;

import java.util.Arrays;

public class Calculation {
    private String calculation;


    public void toSolve(String calculation) {
        char[] solve = calculation.substring(0,calculation.length()).toCharArray();
        String s = "";
        String result;
        int cont = 0;
        //solve= Arrays.copyOfRange(solve, 0, 1);
        //solve= Arrays.copyOfRange(solve, 0, solve.length - 1);
        /**Обратите внимание на то что создаем массив на 2 символа менше та как первый и последний  символ массива solve
         * не используеться та как они закрываюшие. Реализуем контроллер для понмиание где начинаеться и за заканчиваеться отрываюшая и
         * закрываюшая скобка. Пока скобака отрываюшая мы прибавляем +1 к cont если закрываемая скобка то -1 к cont
         * и проверяем если пока cont не равно 0 то мы елементы массива прибавляем к строке
         * если cont равно то мы проводи операцию со строкой и запоминаем при  этом обнуляем строку*/
        char[] solveTo = new char[solve.length - 2];
        for (int i = 1; i < solve.length - 1; i++) {
            solveTo[i - 1] = solve[i];
            if (solveTo[i - 1] == '(') {
                cont++;
            }
            if (solveTo[i - 1] == ')') {
                cont--;
            }
            s = s + solveTo[i - 1];
            if (cont == 0) {
                System.out.print(s);
                //System.out.println("["+solveTo[i -1]+"]");
                s = "";
            }

        }
        System.out.println("END");
    }

    public String toSolveNo(String calculation) {

        char[] solveR = calculation.toCharArray();
        char[] solve = Arrays.copyOfRange(solveR,1,solveR.length-1);
        String s = "";
        int cont = 0;
        String res = "";

        /**Реализуем контроллер для понмиание где начинаеться и за заканчиваеться отрываюшая и
         * закрываюшая скобка. Пока скобака отрываюшая мы прибавляем +1 к cont если закрываемая скобка то -1 к cont
         * и проверяем если пока cont не равно 0 то мы елементы массива прибавляем к строке
         * если cont равно то мы проводи операцию со строкой и запоминаем при  этом обнуляем строку*/
        char[] solveTo = new char[solve.length];
        int k = 0;
        String[] result = new String[3];
        for (int i = 0; i < solve.length; i++) {
            solveTo[i] = solve[i];
            if (solveTo[i] == '(') {
                cont++;
            }
            if (solveTo[i] == ')') {
                cont--;
            }
            s = s + solveTo[i];
            if (cont == 0) {
                //System.out.println(s);
                System.out.println("Iteration " + k);
                if (s.equals("/")) {
                    System.out.println(s);
                } else {
                    result[k] = calculation(s);
                }
                s = "";
                k++;
            }

        }
        System.out.println("END");
        return res;
    }
    /**                     (((400+2)-(2*3))/((6-2)/(3-1)))/((3-1+20)*3)
     *                 (((400+2)-(2*3))/((6-2)/(3-1)))                            (3-1+20)*3
     *     ((400+2)-(2*3))        /        ((6-2)/(3-1))                       (3-1+20)      3
     * (400+2)        (2*3)              (6-2)      (3-1)
     * */
    public String calculation(String atr) {
        /**мы дожны разбить строку до момента когда встречаеться большое количество повторяюшихся скобкок после знака * или / это
         * будет середина то есть eще скобки [\(\)] перед  * или /  до болшого скопления ( */
        String[] parts = atr.split("[\\(\\)]");
        String calculation = null;
        String result = null;
        int k=0;
        System.out.println(atr);
        for (int i=0;i<parts.length;i++) {
            System.out.println(k+" " + parts[i]);
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

    public String divide(String art) {
        int divide = 0;
        String[] arr_num = art.split("\\/");
        for (int i = 0; i < arr_num.length; i++) {
            if (i != arr_num.length - 1) {
                int start = Integer.parseInt(arr_num[i]);
                int end = Integer.parseInt(arr_num[i + 1]);
                System.out.println(arr_num[i] + " " + arr_num[i + 1]);
                end = start / end;
                arr_num[i + 1] = String.valueOf(end);
            }
            if (i == arr_num.length - 1) divide = Integer.parseInt(arr_num[i]);
        }
        System.out.println(divide);
        return String.valueOf(divide);
    }

    public String add(String art) {
        int adding = 0;
        String[] arr_num = art.split("\\*");
        for (int i = 0; i < arr_num.length; i++) {
            if (i != arr_num.length - 1) {
                int start = Integer.parseInt(arr_num[i]);
                int end = Integer.parseInt(arr_num[i + 1]);
                System.out.println(arr_num[i] + " " + arr_num[i + 1]);
                end = start * end;
                arr_num[i + 1] = String.valueOf(end);
            }
            if (i == arr_num.length - 1) adding = Integer.parseInt(arr_num[i]);
        }
        System.out.println(adding);
        return String.valueOf(adding);
    }

    public String operationPM(String art) {
        /**Тут я обвявляю два массива в первый  массив я записываю числа во второй  знаки + или - для понимания когда мне производить операцию*/
        String[] arr_num = art.split("[+-]");
        String[] pl_mn = art.replaceAll("[0-9]+", ",").split(",");
        /**Обратите внимание что В первый элемент массива записываеться пустота а потом + или - */
        //54+4+6-3-1
        //54 4 6 3 1
        int SM = 0;
        int k = 1;
        for (int i = 0; i < arr_num.length; i++) {

            if (i != arr_num.length - 1) {
                int start = Integer.parseInt(arr_num[i]);
                int end = Integer.parseInt(arr_num[i + 1]);

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
            if (i == arr_num.length - 1) SM = Integer.parseInt(arr_num[i]);
            k++;
        }
        System.out.println(SM);
        return String.valueOf(SM);
    }
}
