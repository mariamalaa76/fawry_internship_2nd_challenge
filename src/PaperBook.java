public class PaperBook extends BookItem{
    private int stock;

    public PaperBook(String bookTitle, int year, String author, String isbn, double price) {
        super(bookTitle, year, author, isbn, price);
    }


    @Override
    public boolean isForSale() {
        return true;
    }

    @Override
    public void processPurchase(int quantity, String email, String address) {
        if (stock < quantity) {
            throw new RuntimeException("Quantum book store: Not enough stock for ISBN: " + getIsbn());
        }
        stock -= quantity;
        System.out.println("Quantum book store: Shipping " + quantity + " copies of '" + getBookTitle() + "' to " + address);
    }
}
