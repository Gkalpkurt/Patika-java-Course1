package hafta2_Pratik_Ders;

import java.util.Scanner;

public class MethodPratikleri4 {
    public static void main(String[] args) {
        //123 -> 1+2+3+=6

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayı girin : ");
        int number = scanner.nextInt();

        int sum = sumofDigits(number);

        System.out.println(number + "basamak toplamı = " + sum);

    }
    private static int sumofDigits (int number){
        if (number == 0) return 0;
        return (number % 10) + sumofDigits(number / 10);


    }
}
