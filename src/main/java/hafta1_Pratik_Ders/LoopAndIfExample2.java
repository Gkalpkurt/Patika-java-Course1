package hafta1_Pratik_Ders;

import java.util.Scanner;

public class LoopAndIfExample2 {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("bir değer girin: ");

        int number = scanner.nextInt();

        int factorial = 1;

        for (int i = 1; i <= number ; i++) {
            factorial = factorial * i ;


        }

        System.out.println(number + "! = " + factorial);


    }
}
