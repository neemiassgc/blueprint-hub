package com.java.time.drafts;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        final String dateTimeString = "04/05/2019 12:30";
        final DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd/MM/uuuu HH:mm", Locale.US);
        final LocalDateTime localDateTime = LocalDateTime.parse(dateTimeString, parser);
        System.out.println(localDateTime);

        DayOfWeek dayOfWeek = parser.parse(dateTimeString, DayOfWeek::from);
        boolean isWeekend = parser.parse(dateTimeString, temporal -> {
            DayOfWeek day = DayOfWeek.from(temporal);
            return day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY;
        });

        System.out.printf("Is %s a weekend? %s%n", dayOfWeek, isWeekend ? "yes" : "no");

        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder()
                .appendPattern("dd/MM/uuuu[ HH:mm]")
                .parseDefaulting(ChronoField.HOUR_OF_DAY, 10)
                .parseDefaulting(ChronoField.MINUTE_OF_HOUR, 30)
                .parseDefaulting(ChronoField.OFFSET_SECONDS, ZoneOffset.of("-03:00").getTotalSeconds());

        DateTimeFormatter builtParser = builder.toFormatter();

        OffsetDateTime parsedDate = OffsetDateTime.parse("05/06/2019", builtParser);
        System.out.println("Parsed date with pre-defined fields: " + parsedDate);

        final Map<Long, String> daysOfMonth = new HashMap<>();
        for (int day = 0; day <= 31; day++) {
            String text = "";
            switch (day) {
                case 1, 21, 31 -> text = day+"st";
                case 2, 22 -> text = day+"nd";
                case 3, 23 -> text = day+"rd";
                default -> text = day+"th";
            }

            daysOfMonth.put((long)day, text);
        }

        final DateTimeFormatter dayOfMonthFormatter = new DateTimeFormatterBuilder()
            .parseCaseInsensitive()
            .appendPattern("MMMM ")
            .appendText(ChronoField.DAY_OF_MONTH, daysOfMonth)
            .appendPattern(", uuuu")
            .toFormatter(Locale.US);


        System.out.println("American format: " + localDateTime.format(dayOfMonthFormatter));
    }
}
