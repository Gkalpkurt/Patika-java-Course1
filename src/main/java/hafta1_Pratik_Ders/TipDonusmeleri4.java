package hafta1_Pratik_Ders;

public class TipDonusmeleri4 {
    public static void main(String[] args) {
        long buyukSayi = 130L;
        byte byteDeger = (byte) buyukSayi;

        System.out.println(buyukSayi); // Çıktı: 130
        System.out.println(byteDeger); // Çıktı: -126 (Byte tipinin sınırlarını aştığı için hatalı dönüşüm oluşur)
    }
}
