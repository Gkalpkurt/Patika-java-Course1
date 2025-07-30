package Hafta2_Ödevler.Hafta2_MaasHesaplayici;

// Bu sınıf, fabrika çalışanlarını temsil eder.
public class MaasHesaplama {

    // ---- Nitelikler (Fields) ----

    // Çalışanın adı ve soyadı
    String name;

    // Çalışanın maaşı
    double salary;

    // Haftalık çalışma saati
    int workHours;

    // İşe başlama yılı
    int hireYear;

    // ---- Constructor (Kurucu metot) ----
    // Sınıf üzerinden bir nesne (çalışan) oluşturulduğunda bu metot otomatik çalışır.
    // Parametre olarak ad, maaş, çalışma saati ve işe başlama yılı alır.
    public MaasHesaplama(String name, double salary, int workHours, int hireYear) {
        this.name = name;               // dışarıdan gelen name değerini sınıf içindeki name'e atıyoruz
        this.salary = salary;           // aynı şekilde salary ataması
        this.workHours = workHours;     // aynı şekilde workHours ataması
        this.hireYear = hireYear;       // aynı şekilde hireYear ataması
    }

    // ---- Vergi Hesaplama Metodu ----
    public double tax() {
        // Eğer maaş 1000 TL'den azsa vergi alınmaz
        if (this.salary < 1000) {
            return 0;
        } else {
            // Maaş 1000 TL'den fazlaysa %3 vergi alınır
            return this.salary * 0.03;
        }
    }

    // ---- Bonus Hesaplama Metodu ----
    public double bonus() {
        // Eğer haftalık çalışma süresi 40'tan fazlaysa bonus verilir
        if (this.workHours > 40) {
            // Fazladan çalışılan saat hesaplanır
            int extraHours = this.workHours - 40;

            // Her fazla saat için 30 TL bonus
            return extraHours * 30.0;
        } else {
            // 40 saatten fazla çalışmadıysa bonus 0 olur
            return 0;
        }
    }

    // ---- Maaş Artışı (Zam) Hesaplama Metodu ----
    public double raiseSalary() {
        // Şu anki yıl sabit olarak 2021
        int currentYear = 2021;

        // Kaç yıl çalıştığını hesaplıyoruz
        int workingYears = currentYear - this.hireYear;

        // Eğer 10 yıldan az çalıştıysa %5 zam
        if (workingYears < 10) {
            return this.salary * 0.05;
        }
        // Eğer 10-19 yıl arasında çalıştıysa %10 zam
        else if (workingYears < 20) {
            return this.salary * 0.10;
        }
        // Eğer 20 yıldan fazla çalıştıysa %15 zam
        else {
            return this.salary * 0.15;
        }
    }

    // ---- Tüm bilgileri yazdıran metot ----
    public String toString() {
        // Yardımcı metotları çağırıyoruz
        double tax = tax();                         // Vergi tutarı
        double bonus = bonus();                     // Bonus tutarı
        double raise = raiseSalary();               // Maaş artış (zam) tutarı

        double salaryWithRaise = this.salary + raise;                   // Zamlı maaş
        double totalSalary = salaryWithRaise - tax + bonus;            // Son toplam maaş

        // Ekrana yazdırılacak bilgileri string olarak döndürüyoruz
        return  "Adı: " + this.name +
                "\nMaaşı: " + this.salary +
                "\nÇalışma Saati: " + this.workHours +
                "\nBaşlangıç Yılı: " + this.hireYear +
                "\nVergi: " + tax +
                "\nBonus: " + bonus +
                "\nMaaş Artışı: " + raise +
                "\nVergi ve Bonus ile birlikte maaş: " + (this.salary - tax + bonus) +
                "\nToplam Maaş (Zamlı): " + totalSalary;
    }
}
