package hafta2_Pratik_Ders;

public class StringMethods {
    public static void main(String[] args) {
        var s = "Lavanta" ;
                String flower = "Papatya"; // 7 karakterden oluşur, string'lerde 0. index'ten başlar

                int length = flower.length();

                System.out.println(flower + " -> " + length + " karakterden oluşmaktadır.");

                char firstIndex = flower.charAt(0);
                System.out.println(firstIndex);

                // char c = flower.charAt(7); // StringIndexOutOfBoundsException

                System.out.println(flower.indexOf('a'));
                System.out.println(flower.indexOf('a', 2));

                System.out.println(flower.substring(3));
                System.out.println(flower.substring(2, 5));

                // System.out.println(flower.substring(5, 12)); // StringIndexOutOfBoundsException

                System.out.println(flower.toUpperCase());
                System.out.println(flower.toLowerCase());

                System.out.println("Lavanta".equals(flower));
                System.out.println("Papatya".equals(flower));
                System.out.println("papatya" .equalsIgnoreCase(flower));
                System.out.println();
                System.out.println(flower.startsWith("Papa"));
                System.out.println(flower.endsWith("t"));
        System.out.println(flower.endsWith("a"));
        System.out.println(flower.endsWith("ya"));
        System.out.println();
        System.out.println("flower".contains("f"));
        System.out.println("flower".contains("w"));
        System.out.println("flower".contains("pa"));
        System.out.println("flower".contains("flower"));
        System.out.println(flower.replace('t', 'T'));
        System.out.println(flower.replace('a', 'A'));





            }
        }

