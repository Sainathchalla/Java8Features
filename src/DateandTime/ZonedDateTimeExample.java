package DateandTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        ZonedDateTime customeZonedDateTime = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("America/New_York"));
        System.out.println(customeZonedDateTime);

//        System.out.println(ZoneId.getAvailableZoneIds());

//        Compare different time zones
        ZonedDateTime indian = ZonedDateTime.now();
        ZonedDateTime american = ZonedDateTime.now(ZoneId.of("America/New_York"));

        System.out.println(indian);
        System.out.println(indian.getZone());
        System.out.println(american);
    }
}
