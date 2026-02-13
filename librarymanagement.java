import java.util.ArrayList;

class Book {
    String title;
    String author;
    String isbn;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
    }

    Book searchByTitle(String title) {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }

    void displayAllBooks() {
        for (Book b : books) {
            System.out.println("Title: " + b.title);
            System.out.println("Author: " + b.author);
            System.out.println("ISBN: " + b.isbn);
            System.out.println();
        }
    }
}

public class librarymanagement {
    public static void main(String[] args) {

        Library library = new Library();

        Book b1 = new Book("Java", "James", "101");
        Book b2 = new Book("DSA", "Mark", "102");
        Book b3 = new Book("OS", "Galvin", "103");

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        System.out.println("All Books:");
        library.displayAllBooks();

        System.out.println("Searching for DSA...");
        Book result = library.searchByTitle("DSA");

        if (result != null) {
            System.out.println("Book Found:");
            System.out.println("Title: " + result.title);
            System.out.println("Author: " + result.author);
            System.out.println("ISBN: " + result.isbn);
        } else {
            System.out.println("Book not found.");
        }
    }
}
