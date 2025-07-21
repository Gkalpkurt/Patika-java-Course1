package hafta2_Pratik_Ders;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocaldateAndTimePratikleri {
    public static void main(String[] args) {

        System.out.println(LocalDateTime.now());
        System.out.println(LocalDate.now());

        int daysToAdd = 30;
        int monthsToAdd = 3;
        int yearsToAdd = 1;

        System.out.println(LocalDate.now().plusDays(daysToAdd));
        System.out.println(LocalDate.now().plusMonths(monthsToAdd));
        System.out.println(LocalDate.now().plusYears(yearsToAdd));

        var date = LocalDate.of(2033, 8, 5);
        System.out.println(date);

        int daysToSubtract = 5;
        int yearsToSubtract = 5;

        System.out.println(LocalDate.now().minusDays(daysToSubtract));
        System.out.println(LocalDate.now().minusYears(yearsToSubtract));

        var expireDate = LocalDate.of(2024, 12, 1);
        boolean isBefore = expireDate.isBefore(LocalDate.now());

        if (isBefore) {
            System.out.println("Paketinizin süresi dolmuştur.");
        }

        boolean after = expireDate.plusMonths(5).isAfter(LocalDate.now());
        System.out.println(after);
    }
}
