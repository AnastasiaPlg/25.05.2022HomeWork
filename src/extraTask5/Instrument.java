package extraTask5;

public interface Instrument {
    Instrument[] instruments = new Instrument[10];
    public String KEY = "C major";

    public void play();

    public default void addInstruments() {
        for (int i = 0; i < instruments.length; i++) {
            if (instruments[i] == null) {
                instruments[i] = this;
                break;
            }
        }
    }

    public static void playInstruments() {
        for (int i = 0; i < instruments.length; i++) {
            if (instruments[i] != null) {
                instruments[i].play();
            }
        }
    }
}
