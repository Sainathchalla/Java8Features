package DateandTime;

import java.time.LocalDateTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        System.out.println(localDateTime.toLocalDate());
        System.out.println(localDateTime.toLocalTime());

        System.out.println(localDateTime.minusMinutes(100));

        System.out.println(localDateTime.plusDays(10000));
    }
}
