package Hafta2_Ödevler;

import java.util.Scanner;

public class GecerliSifreKontrolu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Şifrenizi giriniz: ");
        String sifre = input.nextLine();

        boolean uzunlukKontrol = sifre.length() >= 8;
        boolean boslukKontrol = !sifre.contains(" ");
        boolean ilkHarfKontrol = Character.isUpperCase(sifre.charAt(0));
        boolean sonKarakterKontrol = sifre.charAt(sifre.length() - 1) == '?';

        if (uzunlukKontrol && boslukKontrol && ilkHarfKontrol && sonKarakterKontrol) {
            System.out.println("Geçerli Şifre");
        } else {
            System.out.println("Geçersiz Şifre");
        }

        input.close();
    }
}

