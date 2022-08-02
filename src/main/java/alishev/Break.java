package alishev;

public class Break {

    public static void main(String[] args) {

        String probebel = "";
        for (int e = 0; e <= 20; e++) {
            probebel = probebel + "##";
            System.out.print(probebel);

            System.out.print(" " + e);
            System.out.println();
            if (e == 10) {
                System.out.println("Stop");
                break;
            }


        }
    }
}
