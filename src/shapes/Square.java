package shapes;

public abstract class Square extends Quadrilateral {
    public Square(double length, double width, double length1) {
        super(length, width);
        this.length = length1;
    }


}

//public class Square extends Rectangle {
//    private double side;
//
//    public Square(double side) {
//        super(side,side);
//        this.side = side;
//    }
//
//    public double getArea() {
//        double area = Math.pow(side, 2);
//        System.out.println("The area is: " + area);
//        return area;
//    }
//
//    public double getPerimeter() {
//        double peri = 4 * side;
//        System.out.println("The perimeter is: " + peri);
//        return peri;
//    }

//}
