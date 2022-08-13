package samples_05;

public class C05_Logic {
    // Логические операции.

    // Например:
    // Чтобы проверить условие A < x < B, нельзя записать его в условном операторе непосредственно,
    // так как каждая операция отношения должна иметь два операнда.
    // Правильный способ записи: if ( A < x && x < B).

    public static void main(String[] args) {
        int a = 0, b = 5, x = 3;

        if (a < x && x < b) {   // a < x < b
            System.out.println("Число " + x + " находится в диапазоне чисел от " + a + "  до " + b + ".");
        } else {
            System.out.println("Число " + x + " не попадает в диапазон чисел от " + a + "  до " + b + ".");
        }

        if(a < x) {
            if (x < b) {
                System.out.println("Число " + x + " находится в диапазоне чисел от " + a + "  до " + b + ".");
            }
        } else {
            System.out.println("Число " + x + " не попадает в диапазон чисел от " + a + "  до " + b + ".");
        }

        //какое минимально
        if(a<b && a<x) {
            System.out.println(a);
        } if(b<a &&b<x) {
            System.out.println(b);
        }else {
            System.out.println(x);
        }
    }
}
