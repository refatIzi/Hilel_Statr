package alishev;

import java.util.Random;

public class MultiArray {
    public static void main(String[] args) {
        int[][] array = new int[5][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++)
                array[i][j] = new Random().nextInt(100);
        }


        for (int i = 0; i < array.length; i++) {
            System.out.print(i + 1 + " {");
            for (int j = 0; j < array[0].length; j++) {
                System.out.print("[" + array[i][j] + "]");
            }
            System.out.println("}");
        }
    }
}
