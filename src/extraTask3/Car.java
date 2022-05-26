package extraTask3;

public abstract class Car {
    String carBrand;
    String carClass;
    double weight;
    Driver driver;
    Engine engine;

    @Override
    public String toString() {
        return "Car{" +
                "carBrand='" + carBrand + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }

    public void start() {
        System.out.println("Let's go!");
    }

    public void stop() {
        System.out.println("Stop!");
    }

    public void turnRight() {
        System.out.println("Turn right!");
    }

    public void turnLeft() {
        System.out.println("Turn left!");
    }
}
