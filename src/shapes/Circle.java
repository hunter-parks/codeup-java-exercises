package shapes;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area = Math.pow(radius,2) * Math.PI;
        System.out.printf("Area is: %.2f\n ",area);
        return area;
    }

    public double getCircumference() {
        double circumference = (radius * 2) * Math.PI;
        System.out.printf("The Circumference is: %.2f\n ",circumference);
        return circumference;
    }
}