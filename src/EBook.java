public class EBook extends BookItem {
    private String fileType;

    public EBook(String bookTitle, int year, String author, String  isbn, double price,String fileType) {
        super(bookTitle, year, author, isbn, price);
        this.fileType = fileType;
    }

    @Override
    public void buy(int quantity, String email, String address) {
        if (quantity > 1) {
            throw new IllegalArgumentException("Quantum book store: Only 1 copy per EBook allowed.");
        }
        System.out.println("Quantum book store: EBook purchased. Total: " + price);
        System.out.println("Quantum book store: Sending to MailService at " + email);
    }


}
