package extraTask5;

public class Drum implements Instrument {
    String size;

    public Drum(String size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("The drum with size " + size + " is playing.");
    }
}
