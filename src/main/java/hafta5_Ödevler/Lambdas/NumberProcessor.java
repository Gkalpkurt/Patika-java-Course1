package hafta5_Ödevler.Lambdas;

import java.util.List;

public class NumberProcessor {
    public List<Integer> doubleNumbers(List<Integer> numbers) {
        // Lambda ile her sayıyı 2 ile çarp
        return numbers.stream()
                .map(n -> n * 2)
                .toList();
    }
}