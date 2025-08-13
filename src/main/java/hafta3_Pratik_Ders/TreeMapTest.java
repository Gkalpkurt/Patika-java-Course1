package hafta3_Pratik_Ders;

import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<Integer, String> numbers = new TreeMap<>();

        numbers.put(1, "One");
        numbers.put(2, "Two");
        numbers.put(3, "Three");

        System.out.println("Numbers" + numbers);

        System.out.println("First Key" + numbers.firstKey());

        System.out.println("Last Key" + numbers.lastKey());
    }
}
