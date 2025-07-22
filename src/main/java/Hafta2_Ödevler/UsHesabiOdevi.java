package Hafta2_Ödevler;

import java.util.Scanner;

public class UsHesabiOdevi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban değerini gir: ");
        double base = scanner.nextDouble();

        System.out.print("Üs değerini gir: ");
        int exponent = scanner.nextInt();

        double result = power(base, exponent);

        System.out.println(base + "^" + exponent + " = " + result);
    }

    private static double power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent > 0) {
            return base * power(base, exponent - 1);
        } else {
            return 1 / power(base, -exponent);
        }
    }
}