package LocalDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static java.time.Month.FEBRUARY;
import static java.time.Month.JANUARY;

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

        System.out.println("Практика сравнения дат!");

        LocalDateTime newYear = LocalDateTime.of(2026, JANUARY, 1, 0, 0);
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Сейчас: " + now);
        if (now.isBefore(newYear)) {
            System.out.println("С наступающим!");
        }
        if (now.isAfter(newYear)){
            System.out.println("С прошедшим!");
        }
        if (now.equals(newYear)){
            System.out.println("С новым годом!");
        }


        System.out.println("Практика преобразования LocalDateTime через DateTimeFormatter");

        LocalDateTime now2 = LocalDateTime.now();
        System.out.println("Было: " + now2);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy, HH:mm");
        String formatterDateTime = now2.format(formatter);
        System.out.println("Стало: " + formatterDateTime);
    }
}
