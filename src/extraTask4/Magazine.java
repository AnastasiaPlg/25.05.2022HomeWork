package extraTask4;

public class Magazine implements Printable {
    String nameOfMagazine;

    public Magazine(String nameOfMagazine) {
        this.nameOfMagazine = nameOfMagazine;
    }

    @Override
    public void print() {
        System.out.println("The magazine was printed.");
    }

    public static void printMagazines(Printable[] printable) {
        for (int i = 0; i < printables.length; i++) {
            if (printables[i] != null && printables[i] instanceof Magazine) {
                System.out.println(((Magazine) printables[i]).nameOfMagazine);
            }
        }
    }

    @Override
    public String toString() {
        return nameOfMagazine;
    }
}
