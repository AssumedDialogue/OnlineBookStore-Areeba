package ca.sheridancollege.minhaja.onlinebookstoreareeba.Controller;

//imports referenced from professors dice app
import ca.sheridancollege.minhaja.onlinebookstoreareeba.Model.Book;
import ca.sheridancollege.minhaja.onlinebookstoreareeba.Model.BookCartList;
import ca.sheridancollege.minhaja.onlinebookstoreareeba.Service.BookService;
import ca.sheridancollege.minhaja.onlinebookstoreareeba.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookStoreController {

    @Autowired
    BookService bookService;
    @Autowired
    CartService cartService;

    @GetMapping(value = {"/", "/home"})
    public String index() {
        return "index";
    }

    @GetMapping("/available-books")
    public String availableBooks(Model model) {
        model.addAttribute("books", bookService.getBooks());
        return "available-books";
    }

    @PostMapping("/add-book")
    public String addBook(@RequestParam String isbn, @RequestParam String title, @RequestParam String author, @RequestParam Double price) {
        bookService.addBook(new Book(isbn, title, author, price));
        return "redirect:/available-books";
    }

    @GetMapping("/shopping-cart")
    public String shoppingCart(Model model) {
        model.addAttribute("cart", cartService.getCart());
        return "shopping-cart";
    }

    @PostMapping("/add-to-cart")
    public String addToCart(@RequestParam String isbn) {
        bookService.getBooks().stream()
                .filter(book -> book.getBookISBN().equals(isbn))
                .findFirst()
                .ifPresent(cartService::addToCart);
        return "redirect:/shopping-books";
    }

    @GetMapping("/checkout")
    public String checkout(Model model) {
        model.addAttribute("cart", cartService.getCart());
        model.addAttribute("subtotal", cartService.calculateSubtotal());
        model.addAttribute("tax", cartService.calculateTax());
        model.addAttribute("total", cartService.calculateTotal());
        return "checkout";
    }


}
