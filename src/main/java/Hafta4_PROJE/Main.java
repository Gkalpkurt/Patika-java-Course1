package Hafta4_PROJE;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        boolean isRunning = true;

        while (isRunning) {
            // Display main menu
            System.out.println("\n===== LIBRARY SYSTEM =====");
            System.out.println("1 - Add Book");
            System.out.println("2 - List All Books");
            System.out.println("3 - Search Book");
            System.out.println("4 - Borrow Book");
            System.out.println("5 - Return Book");
            System.out.println("6 - Exit");
            System.out.print("Your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    // Get book details from user
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = scanner.nextLine();

                    System.out.print("Enter Book Number: ");
                    String number = scanner.nextLine();

                    // Create new book and add to library
                    Book newBook = new Book(title, author, number);
                    library.addBook(newBook);

                    System.out.println("Book has been added.");
                    break;

                case "2":
                    // List all books
                    library.listBooks();
                    break;

                case "3":
                    // Search for a book by title
                    System.out.print("Enter Book Title to Search: ");
                    String searchTitle = scanner.nextLine();

                    Book foundBook = library.searchBook(searchTitle);
                    if (foundBook != null) {
                        System.out.println("Book found:");
                        System.out.println(foundBook.toString());
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case "4":
                    // Borrow a book
                    System.out.print("Enter Book Title to Borrow: ");
                    String borrowTitle = scanner.nextLine();

                    boolean borrowed = library.borrowBook(borrowTitle);
                    if (borrowed) {
                        System.out.println("Book has been borrowed.");
                    } else {
                        System.out.println("Book not found or already borrowed.");
                    }
                    break;

                case "5":
                    // Return a book
                    System.out.print("Enter Book Title to Return: ");
                    String returnTitle = scanner.nextLine();

                    boolean returned = library.returnBook(returnTitle);
                    if (returned) {
                        System.out.println("Book has been returned.");
                    } else {
                        System.out.println("Book not found or already available.");
                    }
                    break;

                case "6":
                    // Exit the system
                    isRunning = false;
                    System.out.println("Exiting the system...");
                    break;

                default:
                    // Invalid selection
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
