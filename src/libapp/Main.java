package libapp;

public class Main {
    public static void main(String[] args) {
        LibraryApp app = new LibraryApp();
        app.searchByGenre("Fantasy");
        app.checkinBook("83471");
        app.checkoutBook("45351");
        app.checkoutBook("45351");
//        app.searchByIsbn("45351");
//        app.searchByIsbn("45341");
//        app.searchByTitle("tomorrow");
//        app.searchByTitle("Mystery");
//        app.searchByTitle("Hello");

    }
}