package Hafta3_Ödevler;

import java.util.ArrayList;
import java.util.Collections;

public class EnYakinİkiSayi {
    public static void main(String[] args) {
        ArrayList<Integer> sayilar = new ArrayList<>();

        // 10 adet benzersiz ve pozitif sayı ekleniyor
        sayilar.add(15);
        sayilar.add(3);
        sayilar.add(27);
        sayilar.add(42);
        sayilar.add(8);
        sayilar.add(34);
        sayilar.add(19);
        sayilar.add(7);
        sayilar.add(21);
        sayilar.add(50);

        // Küçükten büyüğe sıralanıyor (çünkü yakınlık kontrolü için gerekli)
        Collections.sort(sayilar);

        // Minimum farkı ve ilgili sayıları tutacak değişkenler
        int minFark = Integer.MAX_VALUE;
        int sayi1 = 0;
        int sayi2 = 0;

        // Sıralı listedeki ardışık elemanların farkı alınarak en küçük fark bulunuyor
        for (int i = 0; i < sayilar.size() - 1; i++) {
            int fark = Math.abs(sayilar.get(i) - sayilar.get(i + 1));
            if (fark < minFark) {
                minFark = fark;
                sayi1 = sayilar.get(i);
                sayi2 = sayilar.get(i + 1);
            }
        }

        // Sonuç ekrana yazdırılıyor
        System.out.println("Birbirine en yakın iki sayı: " + sayi1 + " ve " + sayi2);
        System.out.println("Aralarındaki fark: " + minFark);
    }
}
