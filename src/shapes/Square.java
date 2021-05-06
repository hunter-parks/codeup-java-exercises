package shapes;

public class Square extends Rectangle {
    private double side;

    public Square(double side) {
        super(side,side);
        this.side = side;
    }

    public double getArea() {
        double area = Math.pow(side, 2);
        System.out.println("The area is: " + area);
        return area;
    }

    public double getPerimeter() {
        double peri = 4 * side;
        System.out.println("The perimeter is: " + peri);
        return peri;
    }

}
