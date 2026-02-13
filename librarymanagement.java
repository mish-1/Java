import java.util.ArrayList;

// Book Class
class Book {
    private String title;
    private String author;
    private String isbn;

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    // Display book details
    public void displayBook() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("ISBN   : " + isbn);
        System.out.println("---------------------------");
    }
}

// Library Class
class Library {
    private ArrayList<Book> books = new ArrayList<>();

    // Add book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    // Search by title
    public Book searchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Display all books
    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("Library is empty.");
        } else {
            System.out.println("\nAll Books in Library:");
            System.out.println("---------------------------");
            for (Book book : books) {
                book.displayBook();
            }
        }
    }
}

// Main Class
public class librarymanagement {
    public static void main(String[] args) {

        Library library = new Library();

        // Adding books
        library.addBook(new Book("Java Programming", "James Gosling", "1111"));
        library.addBook(new Book("Data Structures", "Mark Allen Weiss", "2222"));
        library.addBook(new Book("Operating Systems", "Galvin", "3333"));

        // Display all books
        library.displayAllBooks();

        // Search book
        System.out.println("\nSearching for 'Data Structures'...");
        Book found = library.searchByTitle("Data Structures");

        if (found != null) {
            System.out.println("Book Found:");
            found.displayBook();
        } else {
            System.out.println("Book not found.");
        }
    }
}
