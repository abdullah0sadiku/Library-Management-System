
# Simple Library Management System

This is a **console-based Java application** designed to help manage a small collection of books in a library setting. It provides basic functionalities for a librarian to keep track of books, their availability, and their borrowing status. This project serves as a practical exercise for fundamental Java programming concepts.

---

## Features

This system provides the following functionalities:

* **Book Management:**
    * **Add New Books:** Register new books by providing their title, author, and a unique ISBN.
* **Borrowing & Returning:**
    * **Borrow Book:** Mark a book as borrowed using its ISBN.
    * **Return Book:** Mark a book as returned using its ISBN.
* **Book Listing & Status:**
    * **View All Books:** Display a complete list of all books in the library, along with their current status (Available or Borrowed).
    * **View Available Books:** Display only the books that are currently not borrowed.
* **Interactive Menu:** A user-friendly console menu allows easy navigation and selection of different operations.

---

## Technologies Used

* **Java:** The core programming language used for the application logic.

---

## Concepts Demonstrated

This project effectively utilizes and demonstrates the following core Java programming concepts:

* **Classes and Objects:** The `Book` and `LibraryManager` classes encapsulate data and behavior, showcasing object-oriented principles.
* **Constructors:** Used to initialize `Book` and `LibraryManager` objects.
* **Methods:** Encapsulated logic within classes (e.g., `borrowBook()`, `returnBook()`, `findBookByIsbn()`).
* **Lists (`ArrayList`):** Used to store and manage the collection of `Book` objects dynamically.
* **Loops (`for`, `while`):** Essential for iterating through book lists (e.g., for display, search operations).
* **Conditional Statements (`if-else if`, `switch`):** Used for decision-making (e.g., handling user menu choices, checking book availability, validating input).
* **Boolean Logic:** Utilized for managing the `isBorrowed` status of books.
* **User Input (`java.util.Scanner`):** For interacting with the user via the console.

---

## How to Run

To compile and run this application on your local machine, follow these steps:

1.  **Clone the Repository:**
    ```bash
    git clone [https://github.com/abdullah0sadiku/YourRepositoryName.git](https://github.com/abdullah0sadiku/YourRepositoryName.git)
    ```
    (Replace `YourRepositoryName` with the actual name of your GitHub repository.)

2.  **Navigate to the Project Directory:**
    ```bash
    cd YourRepositoryName
    ```
    (Or the specific subdirectory where your `.java` files are located, e.g., `src` if they are in a `src` folder.)

3.  **Compile the Java Files:**
    Open your terminal or command prompt in the directory containing `Book.java`, `LibraryManager.java`, and your main class file (e.g., `Main.java`).
    ```bash
    javac Book.java LibraryManager.java Main.java
    ```
    *If you are using an Integrated Development Environment (IDE) like IntelliJ IDEA or Eclipse, it will typically handle compilation automatically when you run the project.*

4.  **Run the Application:**
    Execute the compiled main class:
    ```bash
    java Main
    ```

---

## Usage Example

Once the application is running, you will be presented with a menu in the console, similar to this:

```
--- Library Management System ---
1. Add New Book
2. Borrow Book by ISBN
3. Return Book by ISBN
4. View All Books
5. View Available Books
6. Exit
Enter your choice: 
```

Follow the prompts to interact with the system. For instance:

* Enter `1` to add a new book, then input its details.
* Enter `2` to borrow a book, providing its ISBN.
* Enter `4` to see a list of all books in the library and their current status.


Have fun coding :) 