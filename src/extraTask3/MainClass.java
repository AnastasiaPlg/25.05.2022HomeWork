package extraTask3;

public class MainClass {
    public static void main(String[] args) {
        Driver driverOfLorry = new Driver("Shubin Osip Borisovich", 35, 10.5);
        Driver driverOfSportCar = new Driver("Kondratiev Ostap Georgievich", 27, 3);
        Lorry lorry = new Lorry(driverOfLorry, 1500);
        SportCar sportCar = new SportCar(driverOfSportCar, 270);
        lorry.start();
        sportCar.turnLeft();
    }
}
