package PeriodAndDuration.Period;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Practicum {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        LocalDate birthday = LocalDate.of(2006, Month.SEPTEMBER, 12);

        Period age = Period.between(birthday, today);
        System.out.println("Ваш возраст:");
        System.out.println("Лет: " + age.getYears());
        System.out.println("Месяцев: " + age.getMonths());
        System.out.println("Дней: " + age.getDays());

    }
}
