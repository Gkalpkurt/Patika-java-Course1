package hafta1_Pratik_Ders;

import java.util.Scanner;

public class SwitchCaseMain2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("birinci sayıysı giriniz: ");
        double number1 = scanner.nextDouble();
        System.out.println("ikinci sayıyı giriniz: ");
        double number2 = scanner.nextDouble();

        System.out.println("İşlem seçiniz (+,-,*,/): ");
        char operation = scanner.next().charAt(0);

        switch (operation) {
            case '-':
                System.out.println("Sonuç:" + (number1 - number2));
                break;
            case '+':
                System.out.println("Sonuç:" + (number1 + number2));
                break;
            case '*':
                System.out.println("Sonuç:" + (number1 * number2));
                break;
            case '/':
            if (number2 !=0) {
                System.out.println("Sonuç:" + (number1 / number2));
            }else {
                System.out.println("ikinci sayı bölme işleminde 0 olamaz");
            }
                break;


            default:
                System.out.println("Geçersiz işlem");




        }





    }
}
