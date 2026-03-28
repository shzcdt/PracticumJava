package Instant;

import java.time.Instant;

public class Practicum {
    public static void main(String[] args) {
        System.out.println("Практика использования класса Instant");
        System.out.println("Использование метода now() и toString()");

        Instant currentTimestamp = Instant.now();
        System.out.println(currentTimestamp);

        System.out.println();

        System.out.println("Использование toEpochMilli()");
        Instant currentTimestamp1 = Instant.now();
        long milliseconds = currentTimestamp1.toEpochMilli();
        System.out.println(milliseconds);

        System.out.println("Использоваие ofEpochSecond и ofEpochMilli");

        Instant satelliteLaunchFromSec = Instant.ofEpochSecond(-386310686L);

        Instant satelliteLaunchFromMilli = Instant.ofEpochMilli(-386310686000L);

        System.out.println(satelliteLaunchFromSec + " - время запуска, заданоое через секунды");
        System.out.println(satelliteLaunchFromMilli + " - время запуска, заданное через миллисекунды");

        System.out.println(Instant.MAX);

        System.out.println(Instant.MIN);
    }
}
