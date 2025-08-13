package hafta5_Ödevler.Enums;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class WorkSchedule {
    private static final Map<String, Day> TR_NAME_TO_DAY = new HashMap<>();

    static {
        putTr("PAZAR", Day.SUNDAY);
        putTr("PAZARTESI", Day.MONDAY);
        putTr("PAZARTESİ", Day.MONDAY);
        putTr("SALI", Day.TUESDAY);
        putTr("CARSAMBA", Day.WEDNESDAY);
        putTr("ÇARŞAMBA", Day.WEDNESDAY);
        putTr("PERSEMBE", Day.THURSDAY);
        putTr("PERŞEMBE", Day.THURSDAY);
        putTr("CUMA", Day.FRIDAY);
        putTr("CUMARTESI", Day.SATURDAY);
        putTr("CUMARTESİ", Day.SATURDAY);
    }

    private static void putTr(String key, Day day) {
        TR_NAME_TO_DAY.put(key.toUpperCase(new Locale("tr", "TR")), day);
    }

    public Day parseDay(String input) {
        if (input == null || input.isBlank()) return null;

        try {
            return Day.valueOf(input.trim().toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException ignored) { }

        String key = input.trim().toUpperCase(new Locale("tr", "TR"));
        return TR_NAME_TO_DAY.getOrDefault(key, null);
    }

    public void showWorkingHours(Day day) {
        System.out.println(day + " çalışma saatleri: " + day.getWorkingHours());
    }
}