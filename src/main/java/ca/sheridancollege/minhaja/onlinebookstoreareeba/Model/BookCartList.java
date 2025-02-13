package ca.sheridancollege.minhaja.onlinebookstoreareeba.Model;

import java.util.ArrayList;
import java.util.List;

public class BookCartList {
    private List<Book> cart = new ArrayList<>();

    public List<Book> getCart() {
        return cart;
    }
    public void addToCart(Book book) {
        cart.add(book);
    }
    public double calculateTotal() {
        return cart.stream().mapToDouble(Book::getBookPrice).sum();
    }

}
