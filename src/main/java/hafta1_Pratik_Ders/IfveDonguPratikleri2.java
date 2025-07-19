package hafta1_Pratik_Ders;

import java.util.Scanner;

public class IfveDonguPratikleri2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("bir sayı girinz. ");
        int number = scanner.nextInt();
        for (int i = 0; i <= number ; i++) {
            if (i%2 == 0){
                System.out.println(i+"çift sayıdır. ");
            }else {
                System.out.println(i+ "tek sayıdır. ");
            }
        }
    }
}
