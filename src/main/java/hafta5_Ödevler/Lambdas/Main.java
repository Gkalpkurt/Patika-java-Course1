package hafta5_Ödevler.Lambdas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Liste oluştur
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // İşlem ve yazdırma sınıflarını kullan
        NumberProcessor processor = new NumberProcessor();
        Printer printer = new Printer();

        // Sayıları iki katına çıkar
        List<Integer> doubled = processor.doubleNumbers(numbers);

        // Sonucu yazdır
        printer.printList(doubled);
    }
}
