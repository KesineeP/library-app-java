package libapp;

import java.util.ArrayList;

public class LibraryApp {
    private BookRepository bookRepo = new BookRepository();

    public void searchByIsbn(String isbn) {
        System.out.printf("Search for books with ISBN %s. \n", isbn);
        Book book = bookRepo.findByIsbn(isbn);
        if(book != null) {
            System.out.printf("1 book found: \n\tTitle: %s\n\tGenre: %s\n\tAuthor: %s", book.getTitle(), book.getGenre(), book.getAuthor());
        }
        else {
            System.out.print("0 books found");
        }
        System.out.print("\n\n");
    }

    public void searchByGenre(String genre) {
        System.out.printf("Search for books with Genre %s. \n", genre);
        Book book = bookRepo.findByGenre(genre);

        if(book != null) {
            System.out.printf("1 book found: \n\tTitle: %s\n\tGenre: %s\n\tAuthor: %s", book.getTitle(), book.getGenre(), book.getAuthor());
        }
        else {
            System.out.print("0 books found");
        }
        System.out.print("\n\n");
    }

    public void searchByTitle(String keyword) {
        System.out.printf("Search for books with '%s' in title. \n", keyword);
        ArrayList<Book> bookFound = bookRepo.findByTitle(keyword);
        System.out.printf("%d book found%s\n", bookFound.size(), !bookFound.isEmpty() ? ":" : ".");
        for(Book book : bookFound) {
            System.out.printf("\tTitle: %s\n\tGenre: %s\n\tAuthor: %s", book.getTitle(), book.getGenre(), book.getAuthor());
            System.out.println("\n");

        }
    }

    public void checkoutBook(String isbn) {
        Book book = bookRepo.findByIsbn(isbn);
        if(book != null) {
            if(book.checkOut()) {
                System.out.println("Book checked out successfully");
                System.out.printf("\tTitle: %s\n\tGenre: %s\n\tAuthor: %s", book.getTitle(), book.getGenre(), book.getAuthor());
            }
            else {
                System.out.println("Checked out FAILED: ");
                System.out.printf("\tTitle: %s\n\tGenre: %s\n\tAuthor: %s", book.getTitle(), book.getGenre(), book.getAuthor());
                System.out.println("\nReason : More books checked out then record quantity \n");
            }
        }
        else {
            System.out.println("Fail to check out book");
            System.out.printf("Reason : There is no book with ISBN %S on record. \n", isbn);
        }
        System.out.println("\n");
    }

    public void checkinBook(String isbn) {
        Book book = bookRepo.findByIsbn(isbn);
        if(book != null) {
            book.checkIn();
            System.out.println("Book checked in successfully");
            System.out.printf("\tTitle: %s\n\tGenre: %s\n\tAuthor: %s", book.getTitle(), book.getGenre(), book.getAuthor());
        }
        else {
            System.out.println("Fail to check in book");
            System.out.printf("Reason : There is no book with ISBN %S on record. \n", isbn);
        }
        System.out.println("\n");
    }
}

