package extraTask3;

public class SportCar extends Car {
    int speedLimit;

    public SportCar(Driver driver, int speedLimit) {
        this.driver = driver;
        this.speedLimit = speedLimit;
        this.carClass = "Sport car";
    }
}
