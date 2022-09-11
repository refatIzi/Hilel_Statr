package homwork.homework10;

import alishev.Arrays;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.random.RandomGenerator;

public class Arrays_Num {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++)
            array[i] = new Random().nextInt(-99, 120);
        for (int i = 0; i < array.length; i++)
            System.out.println(i + 1 + " " + array[i]);
        System.out.println("Below Zero " + belowZero(array));
        System.out.println("Above Zero " + aboveZero(array));

    }

    public static int belowZero(int[] array) {
        int k = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] < 0) k++;
        return k;
    }

    public static int aboveZero(int[] array) {
        int k = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] > 0) k++;
        return k;
    }
}
