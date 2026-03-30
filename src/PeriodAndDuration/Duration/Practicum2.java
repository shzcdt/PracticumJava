package PeriodAndDuration.Duration;

import java.time.Duration;

public class Practicum2 {
    public static void main(String[] args) {
        Duration tenMinutes = Duration.ofMinutes(10);
        System.out.println(tenMinutes);

        Duration fiveDays = Duration.ofDays(5);
        System.out.println(fiveDays);

        Duration sixHours = Duration.ofHours(6);
        System.out.println(sixHours);

        Duration someTime = Duration.ofSeconds(59, 100);
        System.out.println(someTime);
    }
}
