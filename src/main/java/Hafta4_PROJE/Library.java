package Hafta4_PROJE;

import java.util.ArrayList;

public class Library {

    // List that holds all the books in the library
    private ArrayList<Book> books;

    // Constructor – initializes the book list
    public Library() {
        books = new ArrayList<>();
    }

    // Adds a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Lists all books in the library
    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("There are no books in the library.");
        } else {
            for (Book book : books) {
                System.out.println("------------------------");
                System.out.println(book.toString()); // prints book info
            }
        }
    }

    // Searches for a book by its title (case-insensitive)
    public Book searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book; // book found
            }
        }
        return null; // book not found
    }

    // Borrows a book by title if it is available
    public boolean borrowBook(String title) {
        Book book = searchBook(title);
        if (book != null && book.isAvailable()) {
            book.setAvailable(false); // mark as borrowed
            return true;
        }
        return false; // not found or already borrowed
    }

    // Returns a book by title if it was previously borrowed
    public boolean returnBook(String title) {
        Book book = searchBook(title);
        if (book != null && !book.isAvailable()) {
            book.setAvailable(true); // mark as returned
            return true;
        }
        return false; // not found or already available
    }
}
