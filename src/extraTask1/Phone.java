package extraTask1;

public class Phone {
    String number;
    String model;
    double weight;

    public Phone() {
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public void receiveCall(String name) {
        System.out.println(name + " calling");
    }

    public void receiveCall(String name, String number) {
        System.out.println(name + " calling. Phone number " + number);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... numbers) {
        for (String number : numbers) {
            System.out.println(number);
        }
    }

    public void showPhoneInfo(String name) {
        System.out.println(name + " information:\nPhone number: " + number + "\nPhone model: " + model + "\nPhone weight: " + weight);
    }
}
