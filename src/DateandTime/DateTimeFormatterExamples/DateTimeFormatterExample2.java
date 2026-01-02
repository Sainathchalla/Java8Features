package DateandTime.DateTimeFormatterExamples;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


// When we try to parse Date -> 21/12/2012 using LocalDate.parse(21/12/2012), We will get exception because parse method expects date to be like this 2012-12-21.
// So, how we should handle this ? -> We need to parse the date using the help of DateTimeFormatter.
// We need to build a formatter which can help parse method to understand it.
public class DateTimeFormatterExample2 {
    public static void main(String[] args) {

        // Example - 1
        String date = "21/12/2012";
//        LocalDate localDate = LocalDate.parse(date);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(date, dateTimeFormatter);
        System.out.println(localDate);


        // Example - 2
        String dateTime = "2001/09/06 09:22:22+05:30";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ssXXX");
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(dateTime, dateTimeFormatter1);
        System.out.println(zonedDateTime);
    }
}