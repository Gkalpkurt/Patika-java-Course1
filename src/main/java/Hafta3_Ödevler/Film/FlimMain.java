package Hafta3_Ödevler.Film;

public class FlimMain {
    public static void main(String[] args) {
        FlimManager manager = new FlimManager();

        // 5 flim ekleniyor
        manager.flimEkle(new Flim("Inception", 2010, "Bilim Kurgu", 8.8));
        manager.flimEkle(new Flim("Interstellar", 2014, "Bilim Kurgu", 8.6));
        manager.flimEkle(new Flim("Gladiator", 2000, "Tarih", 8.5));
        manager.flimEkle(new Flim("Joker", 2019, "Drama", 8.4));
        manager.flimEkle(new Flim("The Dark Knight", 2008, "Aksiyon", 9.0));

        // Sıralamalar
        manager.imdbyeGoreSirala();
        manager.yilaGoreSirala();

        // Filtreleme örneği
        manager.turFiltrele("Bilim Kurgu");
    }
}