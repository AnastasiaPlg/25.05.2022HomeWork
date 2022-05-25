package task1;

public class MainClass {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = new Triangle(5, 5, 9);
        figures[1] = new Triangle(7, 5, 3);
        figures[2] = new Rectangle(5, 9);
        figures[3] = new Rectangle(6, 3);
        figures[4] = new Circle(4);
        double sumOfPerimeters = 0;
        for (int i = 0; i < figures.length; i++) {
            sumOfPerimeters = sumOfPerimeters + figures[i].findPerimeter();
        }
        System.out.println(sumOfPerimeters);
    }
}
