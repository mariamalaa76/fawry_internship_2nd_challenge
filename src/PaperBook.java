public class PaperBook extends BookItem{
    private int stock;

    public PaperBook(String bookTitle, int year, String author, String isbn, double price,int stock) {
        super(bookTitle, year, author, isbn, price);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public void buy(int quantity, String email, String address) {
        if (stock < quantity) {
            throw new IllegalArgumentException("Quantum book store: Not enough stock.");
        }
        stock -= quantity;
        double total = price * quantity;
        System.out.println("Quantum book store: Paper book purchased. Total: " + total);
        System.out.println("Quantum book store: Sending to ShippingService at " + address);
    }

}
