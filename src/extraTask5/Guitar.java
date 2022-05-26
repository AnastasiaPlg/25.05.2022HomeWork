package extraTask5;

public class Guitar implements Instrument {
    int countOfStrings;

    public Guitar(int countOfStrings) {
        this.countOfStrings = countOfStrings;
    }

    @Override
    public void play() {
        System.out.println("The guitar with " + countOfStrings + " strings is playing.");
    }

}
