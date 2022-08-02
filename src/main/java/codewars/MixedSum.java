package codewars;

import java.util.Arrays;
import java.util.List;

public class MixedSum {



    /*
     * Assume input will be only of Integer o String type
     */
    public static void main(String[] args) {
        MixedSum mixedSum=new MixedSum();
        System.out.println(mixedSum.sum(Arrays.asList(5,"5")));
        System.out.println(mixedSum.sum(Arrays.asList(9, 3, "7", "3")));
        System.out.println(mixedSum.sum(Arrays.asList("5", "0", 9, 3, 2, 1, "9", 6, 7)));
        System.out.println(mixedSum.sum(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));

    }
    public int sum(List<?> mixed) {
        int sum = 0;
        for (int i=0;i<mixed.size();i++)
        {
           sum=sum+Integer.parseInt(mixed.get(i).toString());
           // System.out.println(Integer.parseInt(mixed.get(i).toString()));
        }

        return sum;
    }
}