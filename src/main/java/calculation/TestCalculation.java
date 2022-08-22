package calculation;

public class TestCalculation {
    public static void main(String[] args) {
        Calculation calculation=new Calculation();
        calculation.toSolveNo("(((400+2)-(2*3))/((6-2)/(3-1)))/((3-1+20)*3)");
      //  calculation.toSolveNo("(((5+4)*2)+12)/(((3-1)*3)-8)");
       //calculation.toSolveNo("(((12+4)/2)-6)/(((5+3)/4)+12)");
       // calculation.toSolveNo("(5+3)*(6-4)*(3-1)");
    }
                            /**(((400+2)-(2*3))/((6-2)/(3-1)))/((3-1+20)*3)"
     *              (((400+2)-(2*3))/((6-2)/(3-1)))                   ((3-1+20)*3
     * ((400+2)-(2*3))        /   ((6-2)/(3-1))                       (3-1+20)   *   3
     * (400+2)   -   (2*3)
     * */
}
