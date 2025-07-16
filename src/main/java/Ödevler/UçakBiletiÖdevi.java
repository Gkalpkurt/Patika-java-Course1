package Ödevler;

import java.util.Scanner;

public class UçakBiletiÖdevi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Mesafeyi km cinsinden giriniz: ");
        double mesafe = input.nextDouble();

        System.out.print("Yaşınızı giriniz: ");
        int yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş-Dönüş): ");
        int tip = input.nextInt();


        if (mesafe <= 0 || yas <= 0 || (tip != 1 && tip != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }

        double birimFiyat = 0.10;
        double normalTutar = mesafe * birimFiyat;


        double yasIndirimi = 0.0;

        if (yas < 12) {
            yasIndirimi = 0.50;
        } else if (yas >= 12 && yas <= 24) {
            yasIndirimi = 0.10;
        } else if (yas > 65) {
            yasIndirimi = 0.30;
        }

        double indirimliTutar = normalTutar - (normalTutar * yasIndirimi);


        if (tip == 2) {
            indirimliTutar = indirimliTutar - (indirimliTutar * 0.20);
            indirimliTutar *= 2;
        }

        System.out.println("Toplam Bilet Fiyatı: " + indirimliTutar + " TL");
    }
}

