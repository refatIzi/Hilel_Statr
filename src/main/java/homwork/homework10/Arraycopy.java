package homwork.homework10;

import java.util.Arrays;

public class Arraycopy {
    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 4, 5, 7};

        System.arraycopy(arr, 3, arr, 2, 3);
        /**Копируем с 3 ячейки 3 элементы это 4 5 7 и вставляем со 2 ячейки и получиться что 2 6 8 4 5 7
         *                                                                                       4 5 7
         *                                                                                   2 6 4 5 7 7*/

        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        Arrays.copyOf(arr, 5);
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
