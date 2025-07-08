public class ShowcaseBook extends BookItem {

    public ShowcaseBook(String bookTitle, int year, String author, String isbn, double price) {
        super(bookTitle, year, author, isbn, price);
    }

    @Override
    public boolean isForSale() {
        return false;
    }

    @Override
    public void processPurchase(int quantity, String email, String address) {
        throw new RuntimeException("Quantum book store: Showcase books are not for sale.");
    }
}
