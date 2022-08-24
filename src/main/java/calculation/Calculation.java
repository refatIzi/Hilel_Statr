package calculation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculation {
    private String calculation;
        /**Тут примененеа сложная рекурсия где один метод вызывает другой а он предыдуший
         * ********************************************************************************
         * Данный Клас решает задачу в виде дерева где все разбиваеться на части и выполняеться*/
    /**
     * *****************************(((400+2)-(2*3))/((6-2)/(3-1)))/((3-1+20)*3)
     * ***************** (((400+2)-(2*3))/((6-2)/(3-1)))                                (3-1+20)*3
     * *******((400+2)-(2*3))        /        ((6-2)/(3-1))                       (3-1+20)      3
     * **(400+2)        (2*3)              (6-2)      (3-1)
     */
    public String toSolve(String calculation) {
        /**Тут мы удаляем скобки такова условие что в моем калькуляторе вся задача должна содержаться в закрывающих скобка
         * к примеру ((3-1+20)*3) должна быть отркыввающая скобка и закрывающяя скобка а сонованая задача которую
         * мы должны решить это (3-1+20)*3*/
        calculation = calculation.substring(1, calculation.length() - 1);
        String res = "";
        Matcher m = Pattern.compile("\\((.*)\\)").matcher(calculation);
        /**тут мы ишим скобки к прмиеру у нас 300-(3*6) у нас есть скобки (3*6) то выпольняеться условие в if (m.find())
         * если у нас нет скобко а такое будет к примеру 500+4 или 500*4 или 500/4 то выпольняеться в else*/
        // System.out.println("check "+m.find());
        if (m.find()) {
            /**проверем на разположение цифрв за скобкой  или после к пример 300[-][+][*][/](3*6)  300- (300[-][+][*][/]) находиться впереди
             * или (3*6)-300 -300 ([-][+][*][/]300) находиться после скобок или у нас окрываюшие и закрывваюшие скобки пропорциональны как тут (30-2)*((500+4)*2)
             * если calculation.indexOf(m.group(0))==0 то то что в скобка находиться в начален сткрои и если calculation.length()>0
             * есть продолжение к примеру -300 имееться*/
            int check = calculation.indexOf(m.group(0));
            calculation = calculation.replace(m.group(0), "");
            if (check == 0 && calculation.length() > 0) {
                System.out.println("состояние A > " + m.group(0) + "::" + calculation);
                if (calculation.contains("+") || calculation.contains("-"))
                    res = operationPM(toSolve(m.group(0)) + calculation);
                if (calculation.contains("*")) res = multi(toSolve(m.group(0)) + calculation);
                if (calculation.contains("/")) res = divide(toSolve(m.group(0)) + calculation);
            } else if (check > 0 && calculation.length() > 0) {
                System.out.println("состояние B > " + calculation + "::" + m.group(0));
                if (calculation.contains("+") || calculation.contains("-"))
                    res = operationPM(calculation + toSolve(m.group(0)));
                if (calculation.contains("*")) res = multi(calculation + toSolve(m.group(0)));
                if (calculation.contains("/")) res = divide(calculation + toSolve(m.group(0)));
            } else {
               res= solTwoBrackets(m.group(0));
            }
        } else {
            /**тут будет остаток то что соталось к пример у нас осталося два значения без скобок 500+4
             * и оно будет тут вычисляться*/
            if (calculation.contains("+") || calculation.contains("-")) res = operationPM(calculation);
            if (calculation.contains("*")) res = multi(calculation);
            if (calculation.contains("/")) res = divide(calculation);
        }
        return res;
    }

    //Solution in two brackets solTwoBrackets решение в две скобки
    /**Метод который определяет открывающие и закрываюшие скобки для определения обшего знака между закрываюшими
     * и котрыавющими скобками ()/() или ()*() или ()+() или ()-() */
    public String solTwoBrackets(String calculation) {
        System.out.println("Solution in two brackets ---------------- start ");
        String res = "";
        if (calculation.matches("\\((.*?)\\)")) {
            char[] solve = calculation.toCharArray();
            String s = "";
            int cont = 0;

            /**Реализуем контроллер для понмиание где начинаеться и за заканчиваеться открываюшая и
             * закрываюшая скобка. Пока скобака отрываюшая мы прибавляем +1 к cont если закрываемая скобка то -1 к cont
             * и проверяем если пока cont не равно 0 то мы елементы массива прибавляем к строке
             * если cont равно то мы проводи операцию со строкой и запоминаем при  этом обнуляем строку*/
            char[] solveTo = new char[solve.length];
            int k = 0;
            String[] result = new String[3];
            for (int i = 0; i < solve.length; i++) {
                solveTo[i] = solve[i];
                s = s + solveTo[i];
                if (solveTo[i] == '(') {
                    cont++;
                }
                if (solveTo[i] == ')') {
                    cont--;
                }
                if (cont == 0) {
                    System.out.println(s);
                    result[k] = s;
                    s = "";
                    k++;
                }
            }
            /**после разбеения к примеру result[(30-2)] result[*] result[((500+4)*2)] мы каждуючасть заптсываем в массив
             * далее проверяем второй элемента на содержания операуии [-] или [+] или [*] или [/] то выполняем
             * действия деленмия умножения сложения и вычитания для этого реализованы специальные методы divide multi и operationPM*/
            if (result[1].contains("+") || result[1].contains("-"))
                res = operationPM(toSolve(result[0]) + result[1] + toSolve(result[2]));
            if (result[1].contains("*"))
                res = multi(toSolve(result[0]) + result[1] + toSolve(result[2]));
            if (result[1].contains("/"))
                res = divide(toSolve(result[0]) + result[1] + toSolve(result[2]));
        }
        return res;
    }



    /**Метод деления*/
    public String divide(String art) {
        System.out.println("Divide "+art);
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
        System.out.println("divide answer "+divide);
        return String.valueOf(divide);
    }
    /**Метод Умножения*/
    public String multi(String art) {
        System.out.println("Multi "+art);
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
        System.out.println("multi answer "+adding);
        return String.valueOf(adding);
    }

    /**Метод сложения и вычитания выпольнин в одном виде*/
    public String operationPM(String art) {
        System.out.println("OperationPM "+art);
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
        System.out.println("OperationPM answer"+SM);
        return String.valueOf(SM);
    }
}
