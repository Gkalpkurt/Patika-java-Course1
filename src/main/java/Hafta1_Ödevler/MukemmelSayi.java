package Hafta1_Ödevler;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı gir: ");
        int sayi = input.nextInt();

        int toplam = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }

        if (toplam == sayi) {
            System.out.println(sayi + " mükemmel sayıdır.");
        } else {
            System.out.println(sayi + " mükemmel sayı değildir.");
        }
    }
}


