package homwork.homwork9;

import java.util.Arrays;
import java.util.Random;

public class Heelp {
    public static void main(String[] args) {
        int[] arr=new int[10];
        Arrays.fill(arr,new Random().nextInt(-100,100));
        System.out.println(Arrays.toString(arr));
    }
}
