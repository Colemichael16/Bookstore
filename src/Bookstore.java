public class Bookstore {
    private static Book[] availableBooks = new Book[10];

    public static void main(String[] args) {
        populateAvailableBooks();
        listAvailableBooks();
        determineBookSelection();
    }
    public static void populateAvailableBooks(){
 Book b1 = new Book("Ready Player One", 15.99, "000034457");
 Book b2 = new Book("Harry Potter", 20.00, "000015865");
 Book b3 = new Book("Minecraft Survival Guide", 15.00, "000041235");
 Book b4 = new Book("The Great Gatsby", 12.99, "0000176821");
    }
    public static void listAvailableBooks(){

    }
    public static void determineBookSelection() {

    }
}
