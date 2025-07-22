package hafta2_Pratik_Ders;

import java.util.Scanner;

public class MethodPratikleri1 {
    public static void main(String[] args) {

        for (int i = 1; i < 1000; i++) {
            boolean isPalindromNumber = isPalindrom(i);

            if (isPalindromNumber) {
                System.out.println(i + " bir palindrom sayıdır.");
            }
            /*
            else {
                System.out.println(i + " bir palindrom sayı değildir.");
            }
            */
        }
    } // <-- main metodu burada kapanmalı

    private static boolean isPalindrom(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = (reversedNumber * 10) + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }
}

