package alishev;

public class For {
    public static void main(String[] args) {
        System.out.println("Лето и Вода");
        for (int i = 12; i != 0; i = i - 2) {
            System.out.println("Вьіпил " + (12 - i));
            if (i == 10) System.out.println("Шас лопну");
            if (i == 6) System.out.println("Лопнул но еще пью");
            if (i == 2) System.out.println("Еще хочу а уже нету");
        }
    }
}
