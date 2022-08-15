package alishev;

public class Alishev_24 {
    public static void main(String[] args) {
        String[] arrey = new String[]{"rifat", "How", "are", "you"};
        StringBuilder myInfo = new StringBuilder("Start");
        for (String arr : arrey) {
            myInfo.append(" " + arr.toUpperCase());
        }
        System.out.println(myInfo);

    }
}
