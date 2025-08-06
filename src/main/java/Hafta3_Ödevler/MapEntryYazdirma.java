package Hafta3_Ödevler;

import java.util.HashMap;
import java.util.Map;

public class MapEntryYazdirma {

    public static void main(String[] args) {
        // HashMap oluşturuluyor
        Map<String, Integer> scores = new HashMap<>();

        // Map'e 5 farklı key-value çifti ekleniyor
        scores.put("Ali", 85);
        scores.put("Ayşe", 92);
        scores.put("Mehmet", 78);
        scores.put("Zeynep", 90);
        scores.put("Burak", 88);

        // Map içindeki entry'ler (anahtar-değer çiftleri) satır satır yazdırılıyor
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            // Her satırda bir entry: "Key = Value" şeklinde
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
