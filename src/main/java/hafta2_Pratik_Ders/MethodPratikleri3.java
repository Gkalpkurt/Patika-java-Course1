package hafta2_Pratik_Ders;

import java.util.Scanner;

public class MethodPratikleri3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir metin girin: ");
        String input = scanner.next();

        String reversdString = reverse(input);
        System.out.println(reversdString);

    }
    private static String reverse (String input){

        if (input.isEmpty()) return  input;


        return reverse(input.substring(1)) + input.charAt(0);
    }




}
