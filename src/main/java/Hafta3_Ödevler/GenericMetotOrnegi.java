package Hafta3_Ödevler;

public class GenericMetotOrnegi {
    public static <T> void printArray(T[] dizi) {
        // Dizi elemanları boşlukla yazdırılıyor
        for (T eleman : dizi) {
            System.out.print(eleman + " ");
        }
        System.out.println(); // Alt satıra geçmek için
    }

    public static void main(String[] args) {
        // Integer türünde bir dizi tanımlanıyor
        Integer[] intArray = {1, 2, 3, 4, 5};

        // String türünde bir dizi tanımlanıyor
        String[] strArray = {"Java", "Generics", "Ödev"};

        // Generic metot çağrılıyor
        printArray(intArray);
        printArray(strArray);
    }
}

