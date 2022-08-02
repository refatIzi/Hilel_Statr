package alishev;

public class While_ {
    public static void main(String[] args) {
        int i = 0 ;
        System.out.println("Заец ест марковку");
        while (true){
            i++;
            if(i!=5)
                System.out.println(i+".вую марковку сьел");
            else {
                System.out.println("Заец переел. ((((((");
                break;
            }
        }
    }
}
