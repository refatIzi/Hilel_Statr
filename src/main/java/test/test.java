package test;

import java.util.Random;

public class test {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++)
            array[i] = new Random().nextInt(100);
        for (int i = 0; i < array.length; i++)
            System.out.println(i + 1 + " element " + array[i]);


    }
}
