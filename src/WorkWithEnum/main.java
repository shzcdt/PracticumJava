package WorkWithEnum;

import java.time.DayOfWeek;

public class main {
    public static void main(String[] args) {
        printHoursForDay(DayOfWeek.FRIDAY);
    }

    public static void printHoursForDay(DayOfWeek day){

        if (DayOfWeek.TUESDAY.equals(day) || DayOfWeek.THURSDAY.equals(day)
                || DayOfWeek.SUNDAY.equals(day)){
            System.out.println("В этот день музей работает с 11:00 до 19:00");
        } else if (DayOfWeek.WEDNESDAY.equals(day) || DayOfWeek.FRIDAY.equals(day)
        || DayOfWeek.SATURDAY.equals(day)){

            System.out.println("В этот день музей работает с 11:00 до 20:00");
        } else {
            System.out.println("Понедельник - выходной");
        }
    }
}

