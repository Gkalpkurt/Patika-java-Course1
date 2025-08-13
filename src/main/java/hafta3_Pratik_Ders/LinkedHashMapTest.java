package hafta3_Pratik_Ders;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {
    public static void main(String[] args) {
        Map<String, String> contries = new LinkedHashMap<>();

        contries.put("TR", "Türkiye");
        contries.put("US", "United States");
        contries.put("DE", "Germany");

        System.out.println("Contries : " + contries);

        contries.remove("DE");

        contries.put("FR", "France");

        System.out.println("Contries : " + contries);
    }
}
