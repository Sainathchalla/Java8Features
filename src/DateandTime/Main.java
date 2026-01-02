package DateandTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAmount;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.getDayOfWeek());


//        LocalTime localTime = LocalTime.now();
//        System.out.println(localTime);
//
//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime);
//
//        ZonedDateTime zonedDateTime = ZonedDateTime.now();
//        System.out.println(zonedDateTime);
//
//        OffsetDateTime offsetDateTime = OffsetDateTime.now();
//        System.out.println(offsetDateTime);
//
//        Instant instant = Instant.now();
//        System.out.println(instant);
//
//        Period period = Period.between(LocalDate.now(), LocalDate.now());
//        System.out.println(period);
//
//        DurationExample duration = DurationExample.ofHours(2);
//        System.out.println(duration);
//
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
//        System.out.println(dateTimeFormatter);
    }
}