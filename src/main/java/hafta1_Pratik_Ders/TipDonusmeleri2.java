package hafta1_Pratik_Ders;

public class TipDonusmeleri2 {
    public static void main(String[] args) {
        double myDouble = 9.78;
        int myInt = (int) myDouble; // Explicit dönüşüm double'dan int'e

        System.out.println(myDouble);   // Çıktı: 9.78
        System.out.println(myInt);      // Çıktı: 9



        double ondalikliSayi = 42.7;
        int sayi = (int) ondalikliSayi;

        System.out.println(ondalikliSayi); // Çıktı: 42.7
        System.out.println(sayi); // Çıktı: 42 (ondalık kısım kaybedilir)




    }
}
