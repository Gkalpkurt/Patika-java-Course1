package Hafta1_Ödevler;

import java.util.Scanner;

public class AritmetikİşlemlerveİşlemÖnceliği {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a sayısını girin: ");
        int a = scanner.nextInt();

        System.out.print("b sayısını girin: ");
        int b = scanner.nextInt();

        System.out.print("c sayısını girin: ");
        int c = scanner.nextInt();

        int sonuc = a + b * c - b;

        System.out.println("İşlem sonucu: " + sonuc);
    }
}
