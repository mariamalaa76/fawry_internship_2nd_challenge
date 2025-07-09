public class ShowcaseBook extends BookItem {

    public ShowcaseBook(String bookTitle, int year, String author, String isbn, double price) {
        super(bookTitle, year, author, isbn, price);
    }

    @Override
    public void buy(int quantity, String email, String address) {
        throw new UnsupportedOperationException("Quantum book store: Showcase books are not for sale.");
    }

}
