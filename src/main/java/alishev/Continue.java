package alishev;

public class Continue {
    public static void main(String[] args) {
        int k=0;
        for (int i = 1; i <= 20; i++){

            if (i < 5) {
                System.out.println(i + ": Return!");
                continue;
            }
            if (i >5) {
                k++;
                System.out.print("Start " + k);
                for (int c = 0; c <= k; c++) {
                    System.out.print(" ");
                }
                for (int l = 0; l <= (20 - k); l++) {

                    System.out.print(" *");
                }
                System.out.println();
                //   continue;

            }


        }

    }
}
