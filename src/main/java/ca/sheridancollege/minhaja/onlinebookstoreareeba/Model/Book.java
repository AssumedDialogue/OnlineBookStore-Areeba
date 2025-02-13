package ca.sheridancollege.minhaja.onlinebookstoreareeba.Model;

import java.util.Random;

public class Book {
    //the private attributes for each book object
    private int isbn; //random generated number
    private String bookISBN;
    private String bookTitle;
    private String bookAuthor;
    private Double bookPrice;

    public Book(String bookISBN, String bookTitle, String bookAuthor, Double bookPrice) {
        this.isbn = generateRandomISBN();
        this.bookISBN = bookISBN;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
    }

    private int generateRandomISBN() {
        Random random = new Random();
        return 100000 + random.nextInt(900000); // this it to ensure a 6 digit number always
    }

    // Getters and setters for the attributes
    public int getIsbn() {return isbn;}
    public String getBookISBN() {return bookISBN;}
    public String getBookTitle() {return bookTitle;}
    public String getBookAuthor() {return bookAuthor;}
    public Double getBookPrice() {return bookPrice;}
}
