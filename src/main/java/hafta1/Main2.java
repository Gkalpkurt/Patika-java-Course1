package hafta1;

public class Main2 {

    public static void main(String[] args) {

        int number =3;

        if (number >= 5) { //false
            //şart gerçekleşirse çalışacak
            System.out.println("sayı 5'ten büyük ve ya 5'e eşitse.");
        } else if (number < 0) {
            System.out.println("Sayı 0'dan küçük");
        }

        if (number == 5) {
            System.out.println("sayı 5'e eşit");
        } else if (number !=5 && number > 5) {

        }


        int not = 61;
        String harfnotu;

        if (not >=85) {
            harfnotu = "A";
        } else if (not >= 70) {
            harfnotu = "B";
        } else if (not >=60) {
            harfnotu = "C";
        } else  {
            harfnotu = "D";

        }


    }

}
