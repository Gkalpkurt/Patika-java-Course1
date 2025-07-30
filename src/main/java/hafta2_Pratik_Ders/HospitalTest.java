package hafta2_Pratik_Ders;

public class HospitalTest {

    public static void main(String[] args) {

        Patient patient = new Patient("1234567890");
        patient.setName("Gökalp");
        patient.setSurname("KURT");
        patient.setAge(22);

        Patient patient1 = new Patient("1234567890");
        patient1.setName("Sude");
        patient1.setSurname("KILIÇ");
        patient1.setAge(24);

        // Kontrol amaçlı çıktı
        System.out.println(patient.getName() + " " + patient.getSurname() + ", Yaş: " + patient.getAge());
        System.out.println(patient1.getName() + " " + patient1.getSurname() + ", Yaş: " + patient1.getAge());
    }
}

