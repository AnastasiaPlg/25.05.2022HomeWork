package task1;

public class Triangle extends Figure {
    public double side1;
    public double side2;
    public double side3;

    public Triangle(double side1, double side2, double side3) {
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            System.out.println("This figure can't be created");
        }
    }

    @Override
    public double findSquare() {
        square = Math.sqrt((perimeter / 2) * (perimeter / 2 - side1) * (perimeter / 2 - side2) * (perimeter / 2 - side3));
        return square;
    }

    @Override
    public double findPerimeter() {
        perimeter = side1 + side2 + side3;
        return perimeter;
    }
}
