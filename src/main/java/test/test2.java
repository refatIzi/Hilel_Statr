package test;

import java.util.Random;

public class test2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100);
          //  System.out.println(i + 1 + " element " + array[i]);
        }
        int buf;
        for(int a=0;a<array.length;a++){
        for (int i = 0; i < array.length-1; i++) {
            if(array[i] > array[i+1]){
                //isSorted = false;

                buf = array[i];
                array[i] = array[i+1];
                array[i+1] = buf;
            }

        }}
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + 1 + " element " + array[i]);
        }
    }
}
