package task1;

public class Circle extends Figure {
    public double radius;
    final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double findSquare() {
        square = PI * Math.pow(radius, 2);
        return square;
    }

    @Override
    public double findPerimeter() {
        perimeter = 2 * PI * radius;
        return perimeter;
    }
}
