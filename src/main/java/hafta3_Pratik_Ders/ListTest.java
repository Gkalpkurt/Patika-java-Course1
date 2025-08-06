package hafta3_Pratik_Ders;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(30);
        ArrayList<Integer> integers1 = new ArrayList<>();
        List<String> shoppingList = new ArrayList<>();

        shoppingList.add("grapes");
        shoppingList.add("banana");
        shoppingList.add("Apple");
        shoppingList.add(1, "mango");

        for (String s : shoppingList) {
            System.out.println(s);
        }

        boolean isAppleRemoved = shoppingList.remove("Apple");
        System.out.println("isAppleRemoved: " + isAppleRemoved);

        boolean isRemoved = shoppingList.remove("ejder meyvesi");
        System.out.println("isRemoved: " + isRemoved);

        System.out.println(shoppingList);

        ArrayList<String> shoppingList2 = new ArrayList<>();
        shoppingList2.add("milk");

        shoppingList.addAll(shoppingList2);
        System.out.println(shoppingList);

        System.out.println(shoppingList.contains("milk"));

        System.out.println("Alışveriş listenizde " + shoppingList.size() + " kadar ürün var");

        System.out.println("Son eleman: " + shoppingList.get(shoppingList.size() - 1));
    }
}
