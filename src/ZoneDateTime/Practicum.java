package ZoneDateTime;

import java.time.*;

public class Practicum {
    public static void main(String[] args) {
        System.out.println("Создание зоны через привязку UTC");

        LocalDateTime localDate = LocalDateTime.now();
        System.out.println(localDate);

        ZoneId zone1 = ZoneId.of("UTC+3");
        System.out.println(zone1);

        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(localDate, zone1);
        System.out.println(zonedDateTime1);

        System.out.println("Создание зоны через временную зону и привязку к региону");

        ZoneId zone2 = ZoneId.of("Japan");
        System.out.println(zone2);

        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(localDate, zone2);
        System.out.println(zonedDateTime2);

        System.out.println("Перевод времени через Instant");

        Instant moment = Instant.ofEpochSecond(-386310686L);
        System.out.println("Timestamp: " + moment);

        ZoneId zone3 = ZoneId.of("Europe/Moscow");
        ZonedDateTime zonedDateTime3 = ZonedDateTime.ofInstant(moment, zone3);

        System.out.println(zonedDateTime3);

        System.out.println("Методы ZoneDateTime");
        ZonedDateTime currentDateTime = ZonedDateTime.now();
        System.out.println("Сейчас: " + currentDateTime);

        ZonedDateTime twoWeeksAgo = currentDateTime.minusDays(3).minusHours(3);
        System.out.println("Три дня и три часа назад было " + twoWeeksAgo);

        System.out.println("Практика метода withZoneSameInstant(ZoneId zone)");
        Instant now = Instant.now();

        ZoneId moscowZone = ZoneId.of("Europe/Moscow");
        ZonedDateTime moscowDateTime = ZonedDateTime.ofInstant(now, moscowZone);

        ZoneId newYorkZone = ZoneId.of("America/New_York");
        ZonedDateTime newYorkDateTime = moscowDateTime.withZoneSameInstant(newYorkZone);

        System.out.println(moscowDateTime);
        System.out.println(newYorkDateTime);

        System.out.println("Практика метода withZoneSameLocal(ZoneId zone)");

        ZonedDateTime newYorkDateTime2 = moscowDateTime.withZoneSameLocal(newYorkZone);
        System.out.println(newYorkDateTime2);
    }
}
