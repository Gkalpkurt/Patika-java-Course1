package hafta5_Ödevler.Enums;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WorkSchedule schedule = new WorkSchedule();

        System.out.print("Günü girin (ör: MONDAY / Pazartesi): ");
        String dayInput = scanner.nextLine();

        Day day = schedule.parseDay(dayInput);

        if (day == null) {
            System.out.println("Geçersiz gün girdiniz. Lütfen geçerli bir gün adı girin.");
        } else {
            schedule.showWorkingHours(day);
        }
    }
}

