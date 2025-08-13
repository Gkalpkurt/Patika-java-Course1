package hafta5_Ödevler.Employee;

public class MainApp {
    public static void main(String[] args) {
        // Çalışan oluşturma
        Employee emp1 = new Employee("Gökalp", "KURT");
        emp1.setContactInfo("0561-661-61-07", "m.emin0012@gmail.com");

        Employee emp2 = new Employee("Sude", "Kılıç");
        emp2.setContactInfo("0561-661-61-61", "Sudekılıç123456@gmail.com");

        // Çalışan iletişim bilgilerini gösterme
        emp1.showEmployeeContactInfo();
        System.out.println();
        emp2.showEmployeeContactInfo();
    }
}

