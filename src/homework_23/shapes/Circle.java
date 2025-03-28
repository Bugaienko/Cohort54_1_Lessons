package homework_23.shapes;

/**
 * @author Sergey Bugaenko
 * {@code @date} 03.12.2024
 */

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        // pi * r * r
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        // 2 * pi * r
        return 2 * Math.PI * radius;
    }
}
