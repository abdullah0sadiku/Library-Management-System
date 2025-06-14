import java.util.List;
import java.util.ArrayList;

public class LibraryManager {
    private List<Book> books;

    public LibraryManager() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getBookInfo());
    }

    public void findBookByIsbn(String isbn){
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                System.out.println("Found book: " + book.getBookInfo());
                return;
            }
        }
        System.out.println("No book found with ISBN: " + isbn);
    }

    public void borrowBookbyIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                book.borrowBook();
                return;
            }
        }
        System.out.println("No book found with ISBN: " + isbn);
    }

    public void returnBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("No book found with ISBN: " + isbn);
    }

    public void displyaAvailableBooks() {
        System.out.println("Available books:");
        for (Book book : books) {
            if (!book.isBorrowed()) {
                System.out.println(book.getBookInfo());
            }
        }
    }

    public void displayAllBooks() {
        System.out.println("All books in the library:");
        for (Book book : books) {
            System.out.println(book.getBookInfo());
        }
    }
}
