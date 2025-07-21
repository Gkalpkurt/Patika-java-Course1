package Hafta2_Ödevler;

import java.util.Scanner;

public class SayiYuvarlamaOdevi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ondalıklı bir sayı giriniz: ");
        double sayi = input.nextDouble();

        System.out.println("Aşağı Yuvarlama: " + (int)Math.floor(sayi));
        System.out.println("Yukarı Yuvarlama: " + (int)Math.ceil(sayi));
        System.out.println("En Yakın Tam Sayı: " + Math.round(sayi));

        input.close();
    }
}

