package hafta1_Pratik_Ders;

import java.util.Scanner;

public class Dowhile1 {
    public static void main(String[] args) {

        /*
        boolean İsTrue = 1<0;

        do {

            System.out.println("en az bir kere çalışır");

        }while (İsTrue);

*/
        Scanner scanner = new Scanner(System.in);

        String password = "6161";

        boolean isPasswordFalse = true;
        int counter = 0;

        do {

            System.out.println("şifre girin");
            String input = scanner.nextLine();
            if (password.equals(input)) {
                System.out.println("doğru şifre");
        } else {
                System.out.println("yanlış şifre");
            counter++;
            }

            }while (counter < 3);

    }
}
