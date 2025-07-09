import java.util.*;

public class Stocking {
    private Map<String, BookItem> inventory  = new HashMap<>();

    public void addBook(BookItem book) {
        inventory.put(book.getIsbn(), book);
        System.out.println("Quantum book store: Book added - " + book.getBookTitle());
    }

    public BookItem removeOutdatedBook(int currentYear, int maxYears) {
        Iterator<Map.Entry<String, BookItem>> iterator = inventory.entrySet().iterator();
        while (iterator.hasNext()) {
            BookItem book = iterator.next().getValue();
            if (currentYear - book.getYear() > maxYears) {
                iterator.remove();
                System.out.println("Quantum book store: Removed outdated book - " + book.getBookTitle());
                return book;
            }
        }
        return null;
    }

    public void buyBook(String ISBN, int quantity, String email, String address) {
        BookItem book = inventory.get(ISBN);
        if (book == null) {
            throw new IllegalArgumentException("Quantum book store: Book not found.");
        }
        book.buy(quantity, email, address);
    }

}
