package hafta3_Pratik_Ders;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        // 30 kapasiteli Integer türünde bir liste oluşturuluyor (başlangıçta boş)
        ArrayList<Integer> integers = new ArrayList<>(30);

        // Boş bir Integer listesi oluşturuluyor
        ArrayList<Integer> integers1 = new ArrayList<>();

        // String türünde bir alışveriş listesi oluşturuluyor
        List<String> shoppingList = new ArrayList<>();

        // Listeye bazı ürünler ekleniyor
        shoppingList.add("grapes"); // 0. index
        shoppingList.add("banana"); // 1. index
        shoppingList.add("Apple");  // 2. index
        shoppingList.add(1, "mango"); // 1. index'e 'mango' ekleniyor, diğerleri kayıyor

        // Listedeki tüm ürünler yazdırılıyor
        for (String s : shoppingList) {
            System.out.println(s);
        }

        // "Apple" ürününü listeden kaldırmaya çalışıyoruz
        boolean isAppleRemoved = shoppingList.remove("Apple");
        System.out.println("isAppleRemoved: " + isAppleRemoved); // true veya false yazdırılır

        // "ejder meyvesi" listede olmadığından silme başarısız olacak
        boolean isRemoved = shoppingList.remove("ejder meyvesi");
        System.out.println("isRemoved: " + isRemoved); // false

        // Listenin mevcut hali yazdırılıyor
        System.out.println(shoppingList);

        // Yeni bir liste oluşturuluyor ve içine "milk" ekleniyor
        ArrayList<String> shoppingList2 = new ArrayList<>();
        shoppingList2.add("milk");

        // shoppingList2'deki tüm elemanlar ana listeye ekleniyor
        shoppingList.addAll(shoppingList2);
        System.out.println(shoppingList); // güncel liste yazdırılır

        // Liste "milk" içeriyor mu?
        System.out.println(shoppingList.contains("milk")); // true

        // Listedeki toplam ürün sayısı yazdırılıyor
        System.out.println("Alışveriş listenizde " + shoppingList.size() + " kadar ürün var");

        // Listenin son elemanı güvenli bir şekilde yazdırılıyor
        if (!shoppingList.isEmpty()) {
            System.out.println("Son eleman: " + shoppingList.get(shoppingList.size() - 1));


            // -- LinkedList

            System.out.println("LinkedList");

            LinkedList<String> linkedList = new LinkedList<>();

            List<String> names = new LinkedList<>();

            names.add("cem");
            names.add("java kursu");
            names.add("patika");

            System.out.println(names);





        }
    }
}
