package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Call {
    public static void main(String[] args) {
        //String calculate = "(57*((5+9)5+67-(90-9))";
        String calculate = "(57$-((-5+9)5+67/(90+9))";
        System.out.println(calculate.matches("[\\d()*/+-]*"));
        System.out.println(calculate.matches("\\((.*?)\\)"));
        String str = "300-((500+4)*2)+(2+4)";
        String st = "{a}[b(c)d]";
        st = st.replaceAll("[()]", "");
        System.out.println("New string is: "+st);
        Matcher m = Pattern.compile("\\((.*)\\)").matcher(str);

        while(m.find())
        {
            System.out.println(m.group(0));
        }
    }
}
