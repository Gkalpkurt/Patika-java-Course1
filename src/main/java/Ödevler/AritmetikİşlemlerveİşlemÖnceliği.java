package Ödevler;

import java.util.Scanner;

public class AritmetikİşlemlerveİşlemÖnceliği {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan sayıları al
        System.out.print("a sayısını girin: ");
        int a = scanner.nextInt();

        System.out.print("b sayısını girin: ");
        int b = scanner.nextInt();

        System.out.print("c sayısını girin: ");
        int c = scanner.nextInt();

        // İşlem: a + b * c - b
        int sonuc = a + b * c - b;

        // Sonucu ekrana yazdır
        System.out.println("İşlem sonucu: " + sonuc);
    }
}
