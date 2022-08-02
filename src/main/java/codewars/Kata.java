package codewars;

public class Kata{

    public static void main(String[] args) {

    }
    public static String bonusTime(final int salary, final boolean bonus) {
        int result;
        if(bonus==true)  result=salary*10;
        else result=salary;
        return String.valueOf(result);
        // show me the code!
    }
}