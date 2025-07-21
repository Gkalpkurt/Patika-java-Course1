package _1_practice;

import java.util.Scanner;

public class BoyKiloEndeksi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Lütfen boyunuzu metre cinsinden girin : ");
        double boy = scanner.nextDouble();

        System.out.print("Lütfen kilonuzu kg cinsinden girin: ");
        double kilo = scanner.nextDouble();

        double bke = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz: " + bke);

        scanner.close();
    }
}
