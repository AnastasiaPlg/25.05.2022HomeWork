package extraTask2;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        Library library = new Library();
        Reader reader1 = new Reader("Krylov Petr Petrovich", "A12354T", "Math",
                LocalDate.of(1991, 4, 21), "+375259987755");
        library.addReaders(reader1);
        Reader reader2 = new Reader("Jukov Igor Ivanovich", "A25844T", "Chem",
                LocalDate.of(1990, 9, 11), "+375336542197");
        library.addReaders(reader2);
        Book book1 = new Book("Leo Tolstoy", "War and Peace");
        library.addBooks(book1);
        Book book2 = new Book("Mikhail Bulgakov", "The Master and Margarita");
        library.addBooks(book2);
        Book book3 = new Book("Fyodor Dostoyevsky", "Crime and Punishment");
        library.addBooks(book3);
        Book book4 = new Book("Alexandre Dumas", "The Three Musketeers");
        library.addBooks(book4);
        reader1.takeBook(book1, book2);
        reader2.takeBook(book2, book3);
        reader1.returnBook(book2);
        reader2.takeBook(book2);

    }




}
