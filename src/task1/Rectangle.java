package task1;

public class Rectangle extends Figure {
    public double side1;
    public double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double findSquare() {
        square = side1 * side2;
        return square;
    }

    @Override
    public double findPerimeter() {
        perimeter = 2 * side1 + 2 * side2;
        return perimeter;
    }
}
