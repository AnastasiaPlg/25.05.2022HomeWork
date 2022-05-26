package extraTask3;

public class Driver extends Person {
    double drivingExperience;

    public Driver(String fullName, int age, double drivingExperience) {
        this.fullName = fullName;
        this.age = age;
        this.drivingExperience = drivingExperience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "drivingExperience=" + drivingExperience +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }
}
