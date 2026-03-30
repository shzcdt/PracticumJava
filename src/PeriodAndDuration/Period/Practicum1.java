package PeriodAndDuration.Period;

import java.time.Period;

public class Practicum1 {
    public static void main(String[] args) {
        Period theHundredYearsWarPeriod = Period.of(116, 4, 25);
        System.out.println(theHundredYearsWarPeriod);

        Period threeWeeks = Period.ofWeeks(3);
        System.out.println(threeWeeks);
    }
}
