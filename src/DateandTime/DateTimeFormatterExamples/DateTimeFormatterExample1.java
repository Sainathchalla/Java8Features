package DateandTime.DateTimeFormatterExamples;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample1 {
    public static void main(String[] args) {
//        LocalDate localDate = LocalDate.parse("2012/12/21");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        System.out.println(dateTimeFormatter);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        String formatedLocalDate = localDate.format(dateTimeFormatter);
        System.out.println(formatedLocalDate);
    }
}
