package Hafta1_Ödevler;

import java.util.Scanner;

public class NSayma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksin? ");
        int adet = input.nextInt();

        System.out.print("1. sayıyı gir: ");
        int sayi = input.nextInt();

        int enBuyuk = sayi;
        int enKucuk = sayi;

        for (int i = 2; i <= adet; i++) {
            System.out.print(i + ". sayıyı gir: ");
            sayi = input.nextInt();

            if (sayi < 0) {
                System.out.println("Negatif sayı, tekrar dene.");
                i--;
                continue;
            }

            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }

            if (sayi < enKucuk) {
                enKucuk = sayi;
            }
        }

        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
    }
}
