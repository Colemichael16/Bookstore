import java.util.Scanner;

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
 Book b4 = new Book("The Great Gatsby", 12.99, "000017682");
 Book b5 = new Book("Harry Potter 2 Better Pots", 10.00, "000015982");
 Book b6 = new Book("Where is waldo?", 5.00, "000019687");
 Book b7 = new Book("Diary of a wimpy kid", 18.00, "000066123");
 Book b8 = new Book("The Hitchhikers guide", 13.00, "000016871");
 Book b9 = new Book("The autobiography of Cole", 40.00, "000075123");
 Book b10 = new Book ("Calvin and Hobbs", 10.99, "000071673");

 availableBooks[0] = b1;
        availableBooks[1] = b2;
        availableBooks[2] = b3;
        availableBooks[3] = b4;
        availableBooks[4] = b5;
        availableBooks[5] = b6;
        availableBooks[6] = b7;
        availableBooks[7] = b8;
        availableBooks[8] = b9;
        availableBooks[9] = b10;

    }
    public static void listAvailableBooks(){
System.out.println("Welcome to the book store!");

for (Book book : availableBooks){
    System.out.println(book.getName());
    System.out.println(book.getPrice());
    System.out.println(book.getIsbn());
    System.out.println("");
}
    }
    public static void determineBookSelection() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please type the number of the book that you want to buy");
        String Item = userInput.nextLine();
    }
}
