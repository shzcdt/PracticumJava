package LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Practicum2 {
    public static void main(String[] args) {
        String input = "14 часов 09 минут. Месяц: 02, День: 14, Год: 1996";
        printCorrectDateTime(input);
        // должно быть 14_02_1966|14:09
    }

    private static void printCorrectDateTime(String input){
        DateTimeFormatter shopFormatter = DateTimeFormatter.ofPattern("HH часов mm минут. Месяц: MM, День: dd, Год: yyyy");
        LocalDateTime dateTime = LocalDateTime.parse(input, shopFormatter);

        DateTimeFormatter correctFormatter = DateTimeFormatter.ofPattern("dd_MM_yyyy|HH:mm");

        String formatterDateTime = dateTime.format(correctFormatter);

        System.out.println(formatterDateTime);
        //сократили до 1 строки
        System.out.println(dateTime.format(correctFormatter));
    }
}
