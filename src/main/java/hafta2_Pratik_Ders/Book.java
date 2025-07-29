package hafta2_Pratik_Ders;

public class Book extends Product {
    private String author;

    public Book(String name) {
        super(name);
    }

    public Book(String name, double price) {
        super(name, price);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
