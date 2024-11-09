import java.util.EnumMap;
import java.util.EnumSet;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumDemo {
    public static void main(String[] args) {
        EnumSet<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SUNDAY);
        System.out.println("Weekend days: " + weekend);

        EnumMap<Day, String> dayActivities = new EnumMap<>(Day.class);
        dayActivities.put(Day.MONDAY, "Work");
        dayActivities.put(Day.SATURDAY, "Relax");

        System.out.println("Day activities: " + dayActivities);
    }
}
