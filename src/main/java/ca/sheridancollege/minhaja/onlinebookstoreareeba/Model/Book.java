package ca.sheridancollege.minhaja.onlinebookstoreareeba.Model;

public class Book {
    //the private attributes for each book object
    private String bookISBN;
    private String bookTitle;
    private String bookAuthor;
    private Double bookPrice;

    public Book(String bookISBN, String bookTitle, String bookAuthor, Double bookPrice) {
        this.bookISBN = bookISBN;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
    }

    // Getters and setters for the attributes
    public String getBookISBN() {return bookISBN;}
    public void setBookISBN(String bookISBN) {this.bookISBN = bookISBN;}

    public String getBookTitle() {return bookTitle;}
    public void setBookTitle(String bookTitle) {this.bookTitle = bookTitle;}

    public String getBookAuthor() {return bookAuthor;}
    public void setBookAuthor(String bookAuthor) {this.bookAuthor = bookAuthor;}

    public Double getBookPrice() {return bookPrice;}
    public void setBookPrice(Double bookPrice) {this.bookPrice = bookPrice;}

}
