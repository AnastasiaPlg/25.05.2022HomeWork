package extraTask4;

public class Book implements Printable {
    String nameOfBook;

    public Book(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    @Override
    public void print() {
        System.out.println("The book was printed.");
    }

    public static void printBooks() {
        for (int i = 0; i < printables.length; i++) {
            if (printables[i] != null && printables[i] instanceof Book) {
                System.out.println(((Book) printables[i]).nameOfBook);
            }
        }
    }

    @Override
    public String toString() {
        return nameOfBook;
    }
}
