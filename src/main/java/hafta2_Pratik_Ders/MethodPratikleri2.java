package hafta2_Pratik_Ders;

import java.util.Scanner;

public class MethodPratikleri2 {
    public static void main(String[] args) {
        // recursive üs alma
        // 2^3 -> 2 * 2 * 2 = 8

        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban değeri gir: ");
        int base = scanner.nextInt();

        System.out.print("Üs değerini gir: ");
        int power = scanner.nextInt();

        int result = power(base, power);

        System.out.println(base + "^" + power + " = " + result);
    }

    private static int power(int base, int power) {
        if (power == 0) {
            return 1;
        }
        return base * power(base, power - 1);
    }
}
