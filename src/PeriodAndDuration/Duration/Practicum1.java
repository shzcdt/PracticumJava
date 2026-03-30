package PeriodAndDuration.Duration;

import java.time.Duration;
import java.time.LocalTime;

public class Practicum1 {
    public static void main(String[] args) {
        LocalTime start = LocalTime.of(0, 0);
        LocalTime finish = LocalTime.of(1, 30);

        Duration ninetyMinutes = Duration.between(start, finish);
        LocalTime noon = LocalTime.of(12, 0);
        System.out.println("Старый момент времени: " + noon);

        LocalTime newTime = noon.plus(ninetyMinutes);

        System.out.println("Новый момент времени: " + newTime);
    }
}
