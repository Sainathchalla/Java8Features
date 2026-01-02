package DateandTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalTime customTime = LocalTime.of(23, 59, 59);
        System.out.println(customTime);

        if (customTime.isAfter(localTime)) {
            System.out.println("Yes");
        }

        // Get DateTime using time and Date
        System.out.println(localTime.atDate(LocalDate.of(1999, 9, 6)));

        System.out.println(localTime.hashCode());

        // Get Date from String
        System.out.println(LocalTime.parse("14:07:30"));
    }
}