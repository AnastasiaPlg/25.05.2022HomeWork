package extraTask4;

public interface Printable {
    Printable[] printables = new Printable[10];

    public void print();

    public default void addToArray() {
        for (int i = 0; i < printables.length; i++) {
            if (printables[i] == null) {
                printables[i] = this;
                break;
            }
        }
    }

    public static void printArray() {
        for (int i = 0; i < printables.length; i++) {
            if (printables[i] == null) {
                continue;
            }
            System.out.println(printables[i].toString());
        }
    }
}
