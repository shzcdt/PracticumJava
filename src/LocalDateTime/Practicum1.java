package LocalDateTime;

import java.time.LocalDateTime;

public class Practicum1 {

    public static final int START_YEAR = 2025;
    public static final int START_DAY = 30;
    public static final int MAX_SHIFT = 8;
    public static final int START_MONTH = 12;


    public static void main(String[] args) {
        System.out.println("Практическое задание");

        printWorkHours(8, 30, 5, 5);
    }

    public static void printWorkHours(
            int startHours,
            int startMinutes,
            int shiftContinuation,
            int shiftAmount
    ){
        if (shiftAmount > MAX_SHIFT) {
            System.out.println("Вссего может быть только 8 смен");
        }

        System.out.println("Расписание смен: ");
        int count = 1;
        int dayCount = START_DAY;
        int yearCount = START_YEAR;
        int monthCount = START_MONTH;

        for (int i = 0; i < shiftAmount; i++){
            LocalDateTime startOfShift = LocalDateTime.of(yearCount, monthCount, dayCount, startHours, startMinutes);
            if (startHours + shiftContinuation > 24){
                dayCount = dayCount + 1;
                startHours = startHours - 24;

                if (dayCount > 30){
                    monthCount = monthCount + 1;
                    dayCount = 1;
                    if (monthCount > 12){
                        yearCount = yearCount + 1;
                        monthCount = 1;
                    }
                }
            }
            LocalDateTime finishOfShift = LocalDateTime.of(yearCount, monthCount, dayCount, startHours + shiftContinuation, startMinutes);

            System.out.println(count + " смена. Начало " + startOfShift + ", конец: " + finishOfShift);
            startHours = startHours + shiftContinuation;
            count = count + 1;
        }

    }
}
