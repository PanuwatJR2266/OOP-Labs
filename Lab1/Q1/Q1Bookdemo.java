package Lab1.Q1;

public class Q1Bookdemo {
    public static void main(String[] args) {
        Q1Book book = new Q1Book("Developing Java Software", "Russel Winder", 79.75);

        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
    }
}
