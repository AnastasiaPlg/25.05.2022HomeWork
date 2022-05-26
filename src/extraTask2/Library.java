package extraTask2;

public class Library {
    public Reader[] readers = new Reader[50];
    public Book[] allBooks = new Book[100];
    public static Book[] takenBooks = new Book[100];
    public void addReaders(Reader reader) {
        for (int i = 0; i < readers.length; i++) {
            if (readers[i] == null) {
                readers[i] = reader;
                break;
            }
        }
    }
    public void addBooks(Book book) {
        for (int i = 0; i < allBooks.length; i++) {
            if (allBooks[i] == null) {
                allBooks[i] = book;
                break;
            }
        }
    }
    public static void takeBook(Book book) {
        for (int i = 0; i < takenBooks.length; i++) {
            if (takenBooks[i] == null) {
                takenBooks[i] = book;
                break;
            }
        }
    }

    public static boolean isBookTakenBefore(Book book) {
        boolean result = false;
        for (int i = 0; i < takenBooks.length; i++) {
            if (takenBooks[i] == null) {
                continue;
            }
            if(book.nameOfBook.equals(takenBooks[i].nameOfBook)) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }

}
