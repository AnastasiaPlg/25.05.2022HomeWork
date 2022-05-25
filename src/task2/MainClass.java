package task2;

public class MainClass {
    public static void main(String[] args) {
        Director director = new Director();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();
        director.showJob();
        worker.showJob();
        accountant.showJob();
    }
}
