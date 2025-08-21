package hafta5_Ödevler.Lambdas;

import java.util.List;

public class Printer {
    public void printList(List<Integer> numbers) {
        // Lambda ile yazdır
        numbers.forEach(n -> System.out.println(n));
    }
}