package Hafta3_Ödevler;

import java.util.ArrayList;
import java.util.Scanner;

public class HarfBulma {
    public static void main(String[] args) {
        // String tipinde 4 elemanlı bir ArrayList oluşturuluyor
        ArrayList<String> harfBulma = new ArrayList<>();
        harfBulma.add("a");
        harfBulma.add("b");
        harfBulma.add("c");
        harfBulma.add("d");

        Scanner input = new Scanner(System.in);

        // 4 kez kullanıcıdan harf alınıyor
        for (int i = 1; i <= 4; i++) {
            System.out.print(i + ". harfi giriniz: ");
            String girilenHarf = input.nextLine();

            // Eğer girilen harf listede varsa "found" ile değiştir
            if (harfBulma.contains(girilenHarf)) {
                int index = harfBulma.indexOf(girilenHarf);
                harfBulma.set(index, "found");
            } else {
                // Yoksa listeye ekle
                harfBulma.add(girilenHarf);
            }
        }

        System.out.println("Güncellenmiş Liste: " + harfBulma);
    }
}
