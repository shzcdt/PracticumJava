package PeriodAndDuration.Duration;

import java.time.Duration;
import java.time.LocalTime;

public class Practicum4 {
    public static void main(String[] args) {
        LocalTime secondTime = LocalTime.of(23, 40);
        LocalTime firstTime = LocalTime.of(14, 25);

        Duration duration = Duration.between(firstTime, secondTime);

        System.out.println("Между двумя моментами времени: ");
        System.out.println(duration.toHours() + " часов, " + duration.toMinutesPart() + " минут,");
        System.out.println("или " + duration.toMinutes() + " минут");
    }
}
