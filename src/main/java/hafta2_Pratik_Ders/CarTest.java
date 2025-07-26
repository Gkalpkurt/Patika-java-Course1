package hafta2_Pratik_Ders;

public class CarTest {
    public static void main(String[] args) {

        // Parametresiz nesne oluşturma
        Car bmw = new Car();

        // Parametreli nesne oluşturma (constructor kullanıldı)
        Car bmw2 = new Car("BMW", "218i");

        // Özellikler set ediliyor
        bmw.setBrand("BMW");
        bmw.setModel("320i");
        bmw.setMaxSpeed(285);
        bmw.setHorsePower(180);

        // Hareket metodu çağrılıyor
        bmw.move();

        // Vites artırılıyor
        bmw.incrementGear(2);

        // Vites değeri okunuyor
        int gear = bmw.getGear();

        // Vites değeri yazdırılıyor
        System.out.println(gear);
    }
}

