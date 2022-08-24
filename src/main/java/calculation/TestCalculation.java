package calculation;

public class TestCalculation {
    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        /**убедитесь что при вводе задачи вы установили закрывающие скобки
         *------------------------- как тут (((500+4)*2)-30) ---------------*/
        /**----------------------------3 открваюших и 3  закрывающих*/
        System.out.println(calculation.check("((((400-2)-(100/2))/((4*4)/8))/((224-200)/12))"));//=87

        //System.out.println(calculation.check("((((400+2)-(2*3))/((6-2)/(3-1)))*((3-1+20)*3))"));//13068
        //System.out.println(calculation.check("500+4"));//=504
        //System.out.println(calculation.check("(((500+4)*2)-30)"));//=978
        //System.out.println(calculation.check("(1100-((500+4)*2))"));//=92
        //System.out.println(calculation.check("((30-2)*((500+4)*2))"));//=28224

    }


}
