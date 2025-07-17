package _1_practice;

import java.util.Scanner;

public class UserInputExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adınızı Girin: ");
        String name = scanner.nextLine();

        System.out.println("Yaşınızı Girin: ");
        int age = scanner.nextInt();

        System.out.println("Merhaba" + name + "," +  age + "yaşındasın");

        scanner.close();







}
}
