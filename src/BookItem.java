abstract public class BookItem {
     private String bookTitle;
     private String year;
     private String author;
     private String isbn;
     private double price;

     public BookItem(String bookTitle, String year, String author,String isbn, double price){
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

    public String getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    //Setter

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract boolean isForSale();
    public abstract void processPurchase(int quantity, String email, String address);
}
