import java.util.ArrayList;
class Book {
    String title;
    String author;
    String isbn;

    Book(String t, String a, String i) {
        title = t;
        author = a;
        isbn = i;
    }
}
class Library {
    ArrayList<Book> list = new ArrayList<>();
    void addBook(Book b) {
        list.add(b);
    }
    void searchByTitle(String name) {
        boolean found = false;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).title.equals(name)) {
                System.out.println("Book Found:");
                System.out.println(list.get(i).title);
                System.out.println(list.get(i).author);
                System.out.println(list.get(i).isbn);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Book not found");
        }
    }

    void displayAll() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).title);
            System.out.println(list.get(i).author);
            System.out.println(list.get(i).isbn);
            System.out.println("----------------");
        }
    }
}

public class hw9 {
    public static void main(String[] args) {

        Library lib = new Library();

        Book b1 = new Book("Java", "James", "101");
        Book b2 = new Book("Python", "Guido", "102");

        lib.addBook(b1);
        lib.addBook(b2);

        lib.displayAll();
        lib.searchByTitle("Java");
    }
}
