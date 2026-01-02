package DateandTime;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {
    public static void main(String[] args) {
        Period period = Period.of(2, 5, 21);
        System.out.println(period);
        System.out.println(period.getDays());


        LocalDate a = LocalDate.now();
        LocalDate b = LocalDate.now().plusWeeks(12);

        System.out.println(a);
        System.out.println(b);
        Period period1 = Period.between(a, b);
        System.out.println(period1);
    }
}
