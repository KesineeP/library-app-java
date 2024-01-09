package libapp;
public class Book {
    private final String isbn;
    private final String title;
    private final String genre;
    private final String description;
    private final String author;
    private int quantity;
    private int numCheckout;

    public Book(String isbn, String title, String genre, String description, String author, int quantity, int numCheckout) {
        this.isbn = isbn;
        this.title = title;
        this.genre = genre;
        this.description = description;
        this.author = author;
        this.quantity = quantity;
        this.numCheckout = numCheckout;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getNumCheckout() {
        return numCheckout;
    }

    public boolean checkOut() {
        if(numCheckout >= quantity) {
            return false;
        }
        numCheckout++;
        return true;
    }

    public boolean checkIn() {
        if(numCheckout <= 0) {
            return false;
        }
        numCheckout--;
        return true;
    }
}
