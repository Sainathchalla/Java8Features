package DateandTime;

import java.time.*;

public class InstantExample {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);

        System.out.println(instant.atZone(ZoneId.of("Asia/Calcutta")));
    }
}