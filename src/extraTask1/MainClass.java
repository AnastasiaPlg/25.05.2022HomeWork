package extraTask1;

public class MainClass {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+375259874563", "Huawei", 165);
        Phone phone2 = new Phone("+375291236547", "Samsung");
        phone2.weight = 156;
        Phone phone3 = new Phone();
        phone3.number = "+375335469873";
        phone3.model = "Apple";
        phone3.weight = 135;
        phone1.showPhoneInfo("phone1");
        phone2.showPhoneInfo("phone2");
        phone3.showPhoneInfo("phone3");
        phone1.receiveCall("Marta");
        String phone2Number = phone2.getNumber();
        System.out.println(phone2Number);
        phone3.receiveCall("Igor", "+3753396362587");
        phone1.sendMessage(phone2Number, phone3.number);
    }
}
