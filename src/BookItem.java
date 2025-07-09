abstract public class BookItem {
     private String bookTitle;
     private int year;
     private String author;
     private String isbn;
     protected double price;

     public BookItem(String bookTitle, int year, String author, String isbn, double price){
         this.bookTitle = bookTitle;
         this.year = year;
         this.author = author;
         this.isbn = isbn;
         this.price = price;
     }

     //Getter
    public String getBookTitle() {
        return bookTitle;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    //Setter

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public abstract void buy(int quantity, String email, String address);
    //public abstract boolean isForSale();
    //public abstract void processPurchase(int quantity, String email, String address);
}
