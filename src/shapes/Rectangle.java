package shapes;

public abstract class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getLength() {
        return super.getLength();
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }
}
//
//public class Rectangle {
//    private double length;
//    private double width;
//
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getArea() {
//        double area = length * width;
//        System.out.println("The area is: " + area);
//        return area;
//    }
//
//    public double getPerimeter() {
//        double peri = (2 * length) + (2 * width);
//        System.out.println("the Perimeter is: " + peri);
//        return peri;
//    }

//}

