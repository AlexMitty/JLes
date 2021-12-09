import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.Locale;


public class DateTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2021, 12, 13);
        DateTimeFormatter formatter1 =
                DateTimeFormatter.ISO_LOCAL_DATE; // YYY-MM-DD
        System.out.println(date.format(formatter1));
        DateTimeFormatter formatter2 =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(date.format(formatter2));
        DateTimeFormatter formatter3 = new DateTimeFormatterBuilder()
                .appendText(ChronoField.DAY_OF_MONTH)
                .appendLiteral(". ")
                .appendText(ChronoField.MONTH_OF_YEAR)
                .appendLiteral(" ")
                .appendText(ChronoField.YEAR)
                .parseCaseInsensitive()
                .toFormatter(Locale.ENGLISH);
        System.out.println(date.format(formatter3));

    }
}
