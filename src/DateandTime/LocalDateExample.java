package DateandTime;

import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        // Get values
        System.out.println(today.getYear());
        System.out.println(today.getMonth());
        System.out.println(today.getMonthValue());
        System.out.println(today.getDayOfMonth());

        // Get date by year, month and date
        LocalDate yesterday = LocalDate.of(2026, 1, 1);
        System.out.println(yesterday);

        if (today.isAfter(yesterday)) {
            System.out.println("Yes");
        }

        // Get date by subtracting
        System.out.println(today.minusDays(1));
        System.out.println(today.minusMonths(200));
        System.out.println(today.minusWeeks(100));
        System.out.println(today.minusYears(100));


    }
}
