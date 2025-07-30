package caseStudyOOPS;

public class Books extends Product {
    String author, genre;

    public Books(String id, String name, double price, String author, String genre) {
        super(id, name, price);
        this.author = author;
        this.genre = genre;
    }

    public void displayDetails() {
        System.out.println("Book: " + name + ", Author: " + author + ", Genre: " + genre + ", Price: ₹" + price);
    }
}
