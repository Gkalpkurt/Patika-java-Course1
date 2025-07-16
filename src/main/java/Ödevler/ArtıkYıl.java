package Ödevler;

import java.util.Scanner;

public class ArtıkYıl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan yıl alınıyor
        System.out.print("Yıl giriniz: ");
        int yil = input.nextInt();

        boolean artikYilMi = false;

        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    artikYilMi = true;
                } else {
                    artikYilMi = false;
                }
            } else {
                artikYilMi = true;
            }
        } else {
            artikYilMi = false;
        }

        // Sonucu yazdır
        if (artikYilMi) {
            System.out.println(yil + " bir artık yıldır.");
        } else {
            System.out.println(yil + " bir artık yıl değildir.");
        }
    }
}