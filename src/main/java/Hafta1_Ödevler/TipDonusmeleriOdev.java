package Hafta1_Ödevler;

import java.util.Scanner;

public class TipDonusmeleriOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir tam sayı giriniz: ");
        int tamSayi = input.nextInt();

        System.out.print("Bir ondalıklı sayı giriniz: ");
        double ondalikliSayi = input.nextDouble();

        double tamdanOndalikliya = (double) tamSayi;

        int ondaliklidantamya = (int) ondalikliSayi;

        System.out.println("Tam sayının ondalıklı hale dönüştürülmüş hali: " + tamdanOndalikliya);
        System.out.println("Ondalıklı sayının tam sayıya dönüştürülmüş hali: " + ondaliklidantamya);

        input.close();
    }
}
