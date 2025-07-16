package _1_practice;

import java.util.Scanner;

public class TempratureExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Celsius Cinsinden Sıaklık Girin: ");
        double celsius = scanner.nextDouble();

        // F = (C * 1.8) + 32

        double f = (celsius * 1.8) + 32;

        System.out.println("C -> F" + f);


    }

}
