import java.util.*;

public class Stocking {
    private Map<String, BookItem> books = new HashMap<>();

    public void addBook(BookItem book) {
        books.put(book.getIsbn(), book);
        System.out.println("Quantum book store: Book added - " + book.getBookTitle());
    }

    public void removeOutdatedBooks(int maxYears) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        List<String> toRemove = new ArrayList<>();

        for (BookItem book : books.values()) {
            if (currentYear - book.getYear() > maxYears) {
                toRemove.add(book.getIsbn());
            }
        }

        for (String isbn : toRemove) {
            BookItem removed = books.remove(isbn);
            System.out.println("Quantum book store: Removed outdated book - " + removed.getBookTitle());
        }
    }

    public double buyBook(String isbn, int quantity, String email, String address) {
        BookItem book = books.get(isbn);
        if (book == null) {
            throw new RuntimeException("Quantum book store: Book with ISBN " + isbn + " not found.");
        }
        if (!book.isForSale()) {
            throw new RuntimeException("Quantum book store: Book '" + book.getBookTitle() + "' is not for sale.");
        }

        book.processPurchase(quantity, email, address);
        double total = book.getPrice() * quantity;
        System.out.println("Quantum book store: Total paid: $" + total);
        return total;
    }
}
