package Hafta4_PROJE;

public class Book {
    private String title;

    // Author of the book
    private String author;

    // Unique identifier for the book (like ISBN)
    private String bookNumber;

    // Availability status: true = available, false = checked out
    private boolean isAvailable;

    // Constructor: creates a new book object with given information
    public Book(String title, String author, String bookNumber) {
        this.title = title;
        this.author = author;
        this.bookNumber = bookNumber;
        this.isAvailable = true; // New books are available by default
    }

    // Returns the title of the book
    public String getTitle() {
        return title;
    }

    // Returns the author of the book
    public String getAuthor() {
        return author;
    }

    // Returns the unique number of the book
    public String getBookNumber() {
        return bookNumber;
    }

    // Returns whether the book is available
    public boolean isAvailable() {
        return isAvailable;
    }

    // Sets the availability status of the book
    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    // Returns the book information in formatted text
    @Override
    public String toString() {
        return "Title: " + title +
                "\nAuthor: " + author +
                "\nBook Number: " + bookNumber +
                "\nStatus: " + (isAvailable ? "Available" : "Checked out");
    }
}