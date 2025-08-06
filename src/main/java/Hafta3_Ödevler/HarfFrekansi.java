package Hafta3_Ödevler;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HarfFrekansi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kelimeyi giriniz: ");
        String kelime = input.nextLine().toLowerCase();

        Map<Character, Integer> frekansMap = new HashMap<>();

        for (int i = 0; i < kelime.length(); i++) {
            char ch = kelime.charAt(i);
            if (Character.isLetter(ch)) {
                frekansMap.put(ch, frekansMap.getOrDefault(ch, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : frekansMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
