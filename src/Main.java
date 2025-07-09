
public class Main {
    public static void main(String[] args) {

        Stocking stock = new Stocking();

        BookItem paperBook = new PaperBook("oop",2022,"Ahmed","ISB001",200,10);
        BookItem eBook = new EBook("DS",2023,"Mohamed","ISB002",200,"PDF");
        BookItem showcase = new ShowcaseBook("ML",2024,"Ahmed","ISB003",200);

        stock.addBook(paperBook);
        stock.addBook(eBook);
        stock.addBook(showcase);

        System.out.println();

        try {
            stock.buyBook("ISB001", 1, "yara@gmail.com", "Giza");
        } catch (UnsupportedOperationException e) {
            System.out.println("Quantum book store: " + e.getMessage());
        }

        System.out.println();

        stock.removeOutdatedBook(2025, 10);
    }
}