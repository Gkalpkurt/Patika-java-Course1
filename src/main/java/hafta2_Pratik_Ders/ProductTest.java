package hafta2_Pratik_Ders;

public class ProductTest {
    public static void main(String[] args) {
        // Product product = new Product(); // Hatalı kullanım çünkü Product'ın boş constructor'ı yok

        Electronic electronic = new Electronic("Kurutma Makinesi");
        // electronic.setName("Kurutma Makinesi"); // Zaten constructor'da set edildi

        Book book = new Book("Savaşçı");
        // book.setName("Savaşçı"); // Zaten constructor'da set edildi
        book.setPrice(255);
    }
}
