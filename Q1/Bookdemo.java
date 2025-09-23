package Q1;

public class Bookdemo {
    public static void main(String[] args) {
        Book book = new Book("Developing Java Software", "Russel Winder", 79.75);

        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
    }
}
