package hafta5_Ödevler.Employee;

public class Employee {
    private String firstName;
    private String lastName;
    private ContactInfo contactInfo; // Inner Class örneği

    // Constructor: Ad ve soyad alır
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Inner Class: Çalışanın iletişim bilgilerini tutar
    public class ContactInfo {
        private String phoneNumber;
        private String email;

        public ContactInfo(String phoneNumber, String email) {
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        // İletişim bilgilerini yazdırır
        public void displayContactInfo() {
            System.out.println("Çalışan: " + firstName + " " + lastName);
            System.out.println("Telefon: " + phoneNumber);
            System.out.println("E-posta: " + email);
        }
    }

    // ContactInfo nesnesini oluşturur ve Employee’ye bağlar
    public void setContactInfo(String phoneNumber, String email) {
        this.contactInfo = new ContactInfo(phoneNumber, email);
    }

    // İletişim bilgilerini gösterir
    public void showEmployeeContactInfo() {
        if (contactInfo != null) {
            contactInfo.displayContactInfo();
        } else {
            System.out.println(firstName + " " + lastName + " için iletişim bilgisi yok.");
        }
    }
}
