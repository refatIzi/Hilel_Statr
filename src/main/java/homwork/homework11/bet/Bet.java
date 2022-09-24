package homwork.homework11.bet;

import hillel.MyScanner;

import java.io.IOException;

public class Bet {
   String stakes;
   String risk;

    public void setStakes(String stakes) {
        this.stakes = stakes;
    }

    public void setRisk(String risk) {
        this.risk = risk;
    }

    public String getStakes() {
        return stakes;
    }

    public String getRisk() {
        return risk;
    }
    Bet() {
        this.risk="";
        this.stakes="";
    }

    Bet(String stakes, String risk){
       this.stakes=stakes;
       this.risk=risk;
   }

    public static void main(String[] args) throws IOException {
        MyScanner myScanner=new MyScanner(System.in);
        Bet bet=new Bet();
        System.out.println("Write stakes");
        String stakes=myScanner.nextLine();
        System.out.println("Write risk");
        String risk=myScanner.nextLine();
        bet.setStakes(stakes);
        bet.setRisk(risk);
        System.out.println(bet.getStakes()+" "+bet.getRisk());
    }
}
