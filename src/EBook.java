public class EBook extends BookItem {
    private String fileType;

    public EBook(String bookTitle, int year, String author, String  isbn, double price) {
        super(bookTitle, year, author, isbn, price);
    }

    @Override
    public boolean isForSale() {
        return true;
    }

    @Override
    public void processPurchase(int quantity, String email, String address) {
        if (quantity != 1) {
            throw new RuntimeException("Quantum book store: Can only purchase one copy of an eBook");
        }
        System.out.println("Quantum book store: Sending eBook '" + getBookTitle() + "' to " + email);
    }
}
