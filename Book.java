public class Book{
    private String title;
    private String author;
    private String isbn;
    private boolean isBorrowed;
    
    public Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
    }
    
    // 5 metoda 
    
    public void borrowBook(){
        if(!isBorrowed){
            isBorrowed = true;
            System.out.println("You have borrowed: " + title);
        } else {
            System.out.println("This book is already borrowed.");
        }
    }

    public void returnBook(){
        if(isBorrowed){
            isBorrowed = false;
            System.out.println("You have returned: " + title);
        } else {
            System.out.println("This book was not borrowed.");
        }
    }

    public String getBookInfo() {
        return title + author + isbn + (isBorrowed ? " (Borrowed)" : " (Available)");
    }

    public String getIsbn(){
        return isbn;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    
}
