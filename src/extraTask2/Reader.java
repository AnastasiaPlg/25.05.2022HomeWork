package extraTask2;


import java.time.LocalDate;
import java.util.Arrays;

public class Reader {
    public String fullName;
    public String numberOfReadingCard;
    public String faculty;
    public LocalDate birthdayDate;
    public String phoneNumber;

    public Reader(String fullName, String numberOfReadingCard, String faculty, LocalDate birthdayDate, String phoneNumber) {
        this.fullName = fullName;
        this.numberOfReadingCard = numberOfReadingCard;
        this.faculty = faculty;
        this.birthdayDate = birthdayDate;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int countOfTakenBooks) {
        System.out.println("Petrov has taken " + countOfTakenBooks + " books.");
    }

    public void takeBook(Book... books) {
        for (int i = 0; i < books.length; i++) {
            if (Library.isBookTakenBefore(books[i])) {
                System.out.println("Book " + books[i].nameOfBook + " was taken before by another reader.");
                books[i] = null;
            }
        }
        System.out.print("Petrov has taken books: ");
        for (int i = 0; i < books.length - 1; i++) {
            if (books[i] == null) {
                continue;
            }
            System.out.print(books[i].nameOfBook + ", ");
        }
        if (books[books.length - 1] != null) {
            System.out.println(books[books.length - 1].nameOfBook + ".");
        }
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                continue;
            }
            for (int j = 0; j < Library.takenBooks.length; j++) {
                if (Library.takenBooks[j] == null) {
                    Library.takenBooks[j] = books[i];
                    break;
                }
            }
        }
    }

    public void returnBook(Book... books) {
        System.out.print("Petrov has returned books: ");
        for (int i = 0; i < books.length - 1; i++) {
            System.out.print(books[i].nameOfBook + ", ");
        }
        System.out.println(books[books.length - 1].nameOfBook + ".");
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                continue;
            }
            for (int j = 0; j < Library.takenBooks.length; j++) {
                if (Library.takenBooks[j] == null) {
                    continue;
                }
                if (books[i].nameOfBook.equals(Library.takenBooks[j].nameOfBook)) {
                    Library.takenBooks[j] = null;
                }
            }
        }
    }

    public void returnBook(int countOfTakenBooks) {
        System.out.println("Petrov has returned " + countOfTakenBooks + " books.");
    }

    public void returnBook(String... namesOfBooks) {
        System.out.print("Petrov has returned books: ");
        for (int i = 0; i < namesOfBooks.length - 1; i++) {
            System.out.print(namesOfBooks[i] + ", ");
        }
        System.out.println(namesOfBooks[namesOfBooks.length - 1] + ".");
    }
}

