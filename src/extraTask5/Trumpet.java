package extraTask5;

public class Trumpet implements Instrument {
    double diameter;

    public Trumpet(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("The trumpet with diameter" + diameter + " is playing.");
    }
}
