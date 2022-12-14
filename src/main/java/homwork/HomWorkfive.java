package homwork;

public class HomWorkfive {
    public static void main(String[] args) {
        // Преобразования логических переменных в соответствии с теоремами Де Моргана.

        // Для применения теорем Де Моргана к логическому оператору AND или OR и паре операндов,
        // требуется инвертировать оба операнда, заменить (AND на OR) или (OR на AND) и
        // инвертировать все выражение полностью.

        //  Исходное выражение                           Эквивалентное выражение
        ///     !A & !B                       =                  !(A | B)
        ///     !A & B                        =                  !(A | !B)
        ///     A & !B                        =                  !(!A | B)
        ///     A & B                         =                  !(!A | !B)
        ///     !A | !B                       =                  !(A & B)
        ///     !A | B                        =                  !(A & !B)
        ///     A | !B                        =                  !(!A & B)
        ///     A | B                         =                  !(!A & !B)
        // boolean a = true;
        // boolean b = false;

        showOperation(true, false);
        showOperation(true, true);
        showOperation(false, true);
        showOperation(false, false);

    }

    private static void showOperation(boolean a, boolean b) {
        // Условие до применения теоремы Де Моргана.
        System.out.println("Условие где A = " + a + " и где B = " + b);
        System.out.println("    !A && !B > " + operation(!a && !b) + " == !(A || B) > " + operation(!(a || b)) + " " + info(!a && !b, !(a || b)));

        System.out.println("    !A && B > " + operation(!a && b) + " == !(A || !B) > " + operation(!(a || !b)) + " " + info(!a && b, !(a || !b)));

        System.out.println("    A && !B > " + operation(a && !b) + " == !(!A || B) > " + operation(!(!a && b)) + " " + info(a && !b, !(!a && b)));

        System.out.println("    A && B > " + operation(a && b) + " == !(!A || !B) > " + operation(!(!a || !b)) + " " + info(a && b, !(!a || !b)));

        System.out.println("    !A || !B > " + operation(!a || !b) + " == !(A && B) > " + operation(!(a && b)) + " " + info(!a || !b, !(a && b)));

        System.out.println("    !A || B > " + operation(!a || b) + " ==  !(A && !B) > " + operation(!(a && !b)) + " " + info(!a || b, !(a && !b)));

        System.out.println("    A || !B > " + operation(a || !b) + " == !(!A & B) > " + operation(!(!a && b)) + " " + info(a || !b, !(!a && b)));

        System.out.println("    A || B = " + operation(a || b) + " ==  !(!A & !B) > " + operation(!(!a && !b)) + " " + info(a || b, !(!a && !b)));

    }

    private static String operation(boolean a) {
        // Условие до применения теоремы Де Моргана.
        if (a) return "ИСТИННА";
        else return "ЛОЖ";

    }

    private static String info(boolean a, boolean b) {
        if (a == b) return "(Де Морган РАБОТАЕТ)";
        else return "(Де Моргана НЕ РАБОТАЕТ Почему?)";

    }

}
