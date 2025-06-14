import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryManager libraryManager = new LibraryManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. View All Books");
            System.out.println("5. View Available Books");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter book title: ");
                        String title = scanner.nextLine();
                        System.out.print("Enter author: ");
                        String author = scanner.nextLine();
                        System.out.print("Enter ISBN: ");
                        String isbn = scanner.nextLine();
                        Book book = new Book(title, author, isbn); 
                        libraryManager.addBook(book);
                        break;
                    case 2:
                        System.out.print("Enter ISBN of book to borrow: ");
                        String isbnToBorrow = scanner.nextLine();
                        libraryManager.borrowBookbyIsbn(isbnToBorrow);
                        break;
                    case 3:
                        System.out.print("Enter ISBN of book to return: ");
                        String isbnToReturn = scanner.nextLine();
                        libraryManager.returnBookByIsbn(isbnToReturn);
                        break;
                    case 4:
                        libraryManager.displayAllBooks();
                        break;
                    case 5:
                        libraryManager.displyaAvailableBooks();
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Consume invalid input
                choice = 0; // Reset choice to continue the loop
            }
        } while (choice != 6);

        scanner.close();
    }
}
