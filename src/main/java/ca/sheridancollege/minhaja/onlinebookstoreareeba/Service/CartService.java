package ca.sheridancollege.minhaja.onlinebookstoreareeba.Service;

import ca.sheridancollege.minhaja.onlinebookstoreareeba.Model.Book;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {
    private List<Book> cart = new ArrayList<>();

    public List<Book> getCart() {
        return cart;
    }

    public void addToCart(Book book) {
        cart.add(book);
    }

    public double calculateSubtotal() {
        return cart.stream().mapToDouble(Book::getBookPrice).sum();
    }
    public double calculateTax() {
        return calculateSubtotal() * 0.13;
    }
    public double calculateTotal() {
        return calculateSubtotal() + calculateTax();
    }
}
