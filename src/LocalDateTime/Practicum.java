package LocalDateTime;

import java.time.LocalDateTime;

import static java.time.Month.FEBRUARY;

public class Practicum {
    public static void main(String[] args) {
        LocalDateTime newMillennium = LocalDateTime.of(2000, 1, 1, 0, 0, 0, 0);
        System.out.println(newMillennium);

        LocalDateTime alsoNewMillennium = LocalDateTime.of(2000, 1, 1, 0, 0);
        System.out.println(alsoNewMillennium);

        LocalDateTime dateTimeOfTwos = LocalDateTime.of(2222, FEBRUARY, 2, 22, 22);
        System.out.println(dateTimeOfTwos);

        System.out.println("Практика методов LocalDateTime");
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Сейчас: " + currentDateTime);

        LocalDateTime twoWeeksAgo = currentDateTime.minusWeeks(2);
        System.out.println("Две недели назад было: " + twoWeeksAgo);

        LocalDateTime newDateTime = currentDateTime.plusMonths(3).plusWeeks(2);
        System.out.println("Через три с половиной месяца будет: " + newDateTime);
    }
}
