package hafta1_Pratik_Ders;

import java.util.Scanner;

public class WhileDongusu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String password ="6161" ;
        while (true){
            System.out.println("şifre gir. ");
            String input = scanner.nextLine();

            if (password.equals(input)){
                System.out.println("doğru şifre girdin. ");
                break;

            }else {
                System.out.println("yanlış şifre. ");

            }
        }

    }
}
