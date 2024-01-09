package libapp;

import java.util.ArrayList;

public class BookRepository {
    private static ArrayList<Book> books = new ArrayList<>();

    public BookRepository() {
        // Add books to the repository
        books.add(new Book("83471", "Tomorrow and Tomorrow and Tomorrow", "Fiction", null, "Gabriel Z.", 10, 8));
        books.add(new Book("45624", "Castles and Crenellations", "Historical", null, "H.P. Anderson", 20, 12));
        books.add(new Book("45351", "The Knight's Sword", "Fantasy", null, "F.E. Anvil",2, 1));
        books.add(new Book("78901", "The Space Odyssey", "Science Fiction", null, "Arthur C. Clarke", 3, 0));
        books.add(new Book("11223", "Mystery at Midnight", "Mystery", null, "Agatha Christie",5,4));
        books.add(new Book("45678", "Into the Wild", "Adventure", null, "Jon Krakauer", 17, 11));
        books.add(new Book("45678", "Enigmatic Mystery", "Mystery", null, "Sherlock Holmes", 12, 5));
    }
    public Book findByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public Book findByGenre(String genre) {
        for (Book book : books) {
            if (book.getGenre().equals(genre)) {
                return book;
            }
        }
        return null;
    }

    public ArrayList<Book> findByTitle(String keyword) {
        ArrayList<Book> bookFound = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                bookFound.add(book);
            }
        }
        return bookFound;
    }


}