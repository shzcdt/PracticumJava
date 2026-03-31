package ZoneDateTime.Watch;

public class Practicum {
    public static void main(String[] args) {
        Watch watch = new Watch();

        System.out.println(watch);
        watch.changeTimeZone();

        System.out.println(watch);

        watch.addTenHours();
        watch.addHour();
        System.out.println(watch);
    }
}
