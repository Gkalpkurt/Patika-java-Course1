package Hafta2_Ödevler;

import java.util.Scanner;

public class AsalSayiOdevi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int sayi = scanner.nextInt();

        boolean sonuc = asalMi(sayi, 2);

        if (sonuc) {
            System.out.println(sayi + " sayısı ASALDIR !");
        } else {
            System.out.println(sayi + " sayısı ASAL değildir !");
        }
    }

    public static boolean asalMi(int sayi, int bolen) {
        if (sayi <= 1) {
            return false; // 1 ve altı asal değildir
        }
        if (bolen == sayi) {
            return true; // kendisine kadar hiç bölünmediyse asaldır
        }
        if (sayi % bolen == 0) {
            return false; // tam bölünüyorsa asal değildir
        }

        return asalMi(sayi, bolen + 1); // sıradaki böleni dene
    }
}
