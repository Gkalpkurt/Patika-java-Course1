package hafta5_Ödevler.Records;

public class MainApp {
    public static void main(String[] args) {
        // Birkaç öğrenci oluşturuyoruz
        Student student1 = new Student("Gökalp", "KURT", "2003");
        Student student2 = new Student("Müzeyyen", "KURT", "1974");
        Student student3 = new Student("Sude", "KILIÇ", "2000"); // student1 ile aynı bilgiler

        // Öğrencilerin bilgilerini yazdırıyoruz
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println();

        // Full name metodu ile ad soyad yazdırma
        System.out.println("Full Name: " + student1.fullName());

        System.out.println();

        // equals() ve hashCode() testleri
        System.out.println("student1 equals student2? " + student1.equals(student2));
        System.out.println("student1 equals student3? " + student1.equals(student3));

        System.out.println("student1 hashCode: " + student1.hashCode());
        System.out.println("student3 hashCode: " + student3.hashCode());

    }
}
