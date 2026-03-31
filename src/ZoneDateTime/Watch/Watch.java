package ZoneDateTime.Watch;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;

public class Watch {
    private ZonedDateTime currentTime;
    private int numOfZone;
    private final List<String> zones = Arrays.asList("America/New_York", "Asia/Vladivostok", "Europe/Moscow", "Japan");

    public Watch() {
        numOfZone = 0;
        ZoneId zone = ZoneId.of(zones.get(numOfZone));
        LocalDateTime dateTime = LocalDateTime.of(2026, 1, 26, 0, 0);
        currentTime = ZonedDateTime.of(dateTime, zone);
    }

    public void changeTimeZone() {
        numOfZone = (numOfZone + 1) % zones.size();
    }

    public void addTenHours() {
        currentTime = currentTime.plusHours(10);
    }

    public void addHour() {
        currentTime = currentTime.plusHours(1);
    }

    public void addTenMinutes() {
        currentTime = currentTime.plusMinutes(10);
    }

    public void addOneMinutes() {
        currentTime = currentTime.plusMinutes(1);
    }

    @Override
    public String toString() {
        return "Watch{" +
                "currentTime=" + currentTime +
                ", numOfZone=" + numOfZone +
                ", zones=" + zones +
                '}';
    }
}
