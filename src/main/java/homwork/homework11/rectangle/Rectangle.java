package homwork.homework11.rectangle;

public class Rectangle implements Rect {
    private double side1;
    private double side2;
    Rectangle() {
        this.side1 = 0;
        this.side2 = 0;
    }
    Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }
    public double areaCalculator() {
        return side1 * side2;
    }

    public double areaCalculator(double side1, double side2) {
        return side1 * side2;
    }

    public double perimeterCalculator() {
        return 2 * (side1 + side2);
    }

    public double perimeterCalculator(double side1, double side2) {
        return 2 * (side1 + side2);
    }
}
