package hafta1_Pratik_Ders;

import java.util.Scanner;

public class IfveDonguPratikleri {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("bir sayı girin:");
        int number = scanner.nextInt();
        if (number % 2 ==0){
            System.out.println(number+"bir çift sayı. ");
        }else {
            System.out.println(number+"bir tek sayı. ");
        }
    }
}
