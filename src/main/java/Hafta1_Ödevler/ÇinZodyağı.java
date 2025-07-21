package Hafta1_Ödevler;

import java.util.Scanner;

public class ÇinZodyağı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz: ");
        int dogumYili = input.nextInt();

        int kalan = dogumYili % 12;
        String zodyak = "";

        switch (kalan) {
            case 0 -> zodyak = "Maymun";
            case 1 -> zodyak = "Horoz";
            case 2 -> zodyak = "Köpek";
            case 3 -> zodyak = "Domuz";
            case 4 -> zodyak = "Fare";
            case 5 -> zodyak = "Öküz";
            case 6 -> zodyak = "Kaplan";
            case 7 -> zodyak = "Tavşan";
            case 8 -> zodyak = "Ejderha";
            case 9 -> zodyak = "Yılan";
            case 10 -> zodyak = "At";
            case 11 -> zodyak = "Koyun";
        }

        System.out.println("Çin Zodyağı Burcunuz: " + zodyak);
    }
}


