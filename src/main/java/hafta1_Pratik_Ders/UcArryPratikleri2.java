package hafta1_Pratik_Ders;

import java.util.Scanner;

public class UcArryPratikleri2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç elemanlı bir dizi girmek istiyorsunuz? ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println(size + " adet sayı giriniz:");

        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + ". sayıyı giriniz: ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("aramak istediğiniz sayıyı girin");
        int number = scanner.nextInt();
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[1] == number){
                counter++;
            }


        }
        System.out.println("aradığın sayıdan"  + counter +  "adet var" );

    }
}
