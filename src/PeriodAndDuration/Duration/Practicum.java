package PeriodAndDuration.Duration;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

public class Practicum {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        int yearOfBirth = 2006;
        Month monthOfBirth = Month.SEPTEMBER;
        int dayOfMonth = 12;
        int hourOfBirth = 9;
        int minuteOfBirth = 0;
        LocalDateTime birthday = LocalDateTime.of(yearOfBirth, monthOfBirth, dayOfMonth, hourOfBirth, minuteOfBirth);

        Duration duration = Duration.between(birthday, now);
        System.out.println("На момент запуска кода вы прожили " + duration.getSeconds() + " секунд и " + duration.getNano() + " наносекунд");
    }
}
