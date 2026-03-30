package PeriodAndDuration.Duration;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Random;

public class Practicum3 {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();

        LocalDateTime start = LocalDateTime.now();

        int num = random.nextInt(5000);
        Thread.sleep(num);

        LocalDateTime finish = LocalDateTime.now();
        Duration duration = Duration.between(start, finish);

        System.out.println("Код выполнился за " + duration.getSeconds() + "." + duration.getNano() + " наносекунд");
    }
}
