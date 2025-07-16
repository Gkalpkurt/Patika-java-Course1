package _1_practice;

import java.util.Scanner;

public class ManavcıGöko {


        public static void main(String[] args) {

            double armutFiyat = 2.14;
            double elmaFiyat = 3.67;
            double domatesFiyat = 1.11;
            double muzFiyat = 0.95;
            double patlicanFiyat = 5.00;

            Scanner input = new Scanner(System.in);

            System.out.print("Armut kaç kilo? : ");
            double armutKg = input.nextDouble();

            System.out.print("Elma kaç kilo? : ");
            double elmaKg = input.nextDouble();

            System.out.print("Domates kaç kilo? : ");
            double domatesKg = input.nextDouble();

            System.out.print("Muz kaç kilo? : ");
            double muzKg = input.nextDouble();

            System.out.print("Patlıcan kaç kilo? : ");
            double patlicanKg = input.nextDouble();


            double toplam = armutKg * armutFiyat
                    + elmaKg * elmaFiyat
                    + domatesKg * domatesFiyat
                    + muzKg * muzFiyat
                    + patlicanKg * patlicanFiyat;


            System.out.printf("Toplam tutar: %.2f TL%n", toplam);

            input.close();
        }
    }


