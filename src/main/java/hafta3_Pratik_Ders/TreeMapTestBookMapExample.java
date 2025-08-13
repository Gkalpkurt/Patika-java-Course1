package hafta3_Pratik_Ders;

import java.util.HashMap;
import java.util.Map;

public class TreeMapTestBookMapExample {
    public static void main(String[] args) {
        Map<String, TreeMapTestBook> bookMap = new HashMap<>();

        bookMap.put("ISB6107", new TreeMapTestBook("Gökalpin hayatı", "Gökalp kurt"));
        bookMap.put("ISB071223", new TreeMapTestBook("Göko Ve Sude", "Gökalp kurt"));

        for (Map.Entry<String, TreeMapTestBook> entry : bookMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}
