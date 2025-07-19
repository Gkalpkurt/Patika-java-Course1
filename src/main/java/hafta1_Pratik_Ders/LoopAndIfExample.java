package hafta1_Pratik_Ders;

import java.util.Scanner;

public class LoopAndIfExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("bir sayı gir: ");
        int number = scanner.nextInt();
        if (number > 0){
            System.out.println("bu sayı pozitiftir. sayı = " + number);
        }else if (number <0){
            System.out.println("bu sayı negatiftir. sayı = " +number);
        }else {
            System.out.println("sayı sıfıra eşittir. sayı = "+ number);
        }
    }
}
