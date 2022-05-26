package extraTask4;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        Book book1 = new Book("The Captain's Daughter");
        book1.addToArray();
        Magazine magazine1 = new Magazine("Cosmopolitan ");
        magazine1.addToArray();
        Book book2 = new Book("Childhood. Adolescence. Youth");
        book2.addToArray();
        Magazine magazine2 = new Magazine("National Geographic");
        magazine2.addToArray();
        Book book3 = new Book("A hero of our time");
        book3.addToArray();
        Magazine magazine3 = new Magazine("Gushi Hui");
        magazine3.addToArray();
        Book.printBooks();
        Printable.printArray();
    }
}
