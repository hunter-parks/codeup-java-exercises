package shapes;


public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        double area = length * width;
        System.out.println("The area is: " + area);
        return area;
    }

    public double getPerimeter() {
        double peri = (2 * length) + (2 * width);
        System.out.println("the Perimeter is: " + peri);
        return peri;
    }

}

