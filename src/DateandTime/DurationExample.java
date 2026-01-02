package DateandTime;

import java.time.Duration;
import java.time.LocalTime;

public class DurationExample {
    public static void main(String[] args) throws InterruptedException {
        Duration duration = Duration.ofHours(3);
        System.out.println(duration);

        LocalTime localTime1 = LocalTime.now();
        System.out.println(localTime1);
//        Thread.sleep(2000);
        LocalTime localTime2 = localTime1.plusHours(4);
        System.out.println(localTime2);

        Duration duration1 = Duration.between(localTime1, localTime2);
        System.out.println(duration1);
    }
}
