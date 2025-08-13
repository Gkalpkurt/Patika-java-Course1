package hafta5_Ödevler.Enums;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

// Enum: Haftanın 7 günü ve çalışma saatlerini tutar
public enum Day {
    SUNDAY   (LocalTime.of(9, 0), LocalTime.of(17, 0)),
    MONDAY   (LocalTime.of(9, 0), LocalTime.of(17, 0)),
    TUESDAY  (LocalTime.of(9, 0), LocalTime.of(17, 0)),
    WEDNESDAY(LocalTime.of(9, 0), LocalTime.of(17, 0)),
    THURSDAY (LocalTime.of(9, 0), LocalTime.of(17, 0)),
    FRIDAY   (LocalTime.of(9, 0), LocalTime.of(17, 0)),
    SATURDAY (LocalTime.of(9, 0), LocalTime.of(17, 0));

    private final LocalTime start;
    private final LocalTime end;

    Day(LocalTime start, LocalTime end) {
        this.start = start;
        this.end = end;
    }

    public String getWorkingHours() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm");
        return start.format(fmt) + " - " + end.format(fmt);
    }
}
