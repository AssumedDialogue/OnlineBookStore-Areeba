package ca.sheridancollege.minhaja.onlinebookstoreareeba.Service;

import ca.sheridancollege.minhaja.onlinebookstoreareeba.Model.Book;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    private List<Book> books = new ArrayList<>();

    public BookService() {
        books.add(new Book( "Book A", "Author A", 19.99));
        books.add(new Book("Book B", "Author B", 18.99));
    }

    public List<Book> getBooks() {
        return books;
    }
    public void addBook(Book book) {
        books.add(book);
    }
}
