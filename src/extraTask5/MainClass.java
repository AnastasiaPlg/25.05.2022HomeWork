package extraTask5;

public class MainClass {
    public static void main(String[] args) {
        Guitar guitar = new Guitar(6);
        guitar.addInstruments();
        Drum drum = new Drum("14\" × 5.5\"");
        drum.addInstruments();
        Trumpet trumpet = new Trumpet(20);
        trumpet.addInstruments();
        Instrument.playInstruments();
    }
}
