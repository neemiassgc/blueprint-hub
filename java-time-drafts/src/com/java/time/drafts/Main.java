package com.java.time.drafts;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	    final LocalDate localDate = LocalDate.of(2018, 5, 13);
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu", new Locale("en", "US"));
        System.out.println(localDate);

        final Instant instant = Instant.now();
        final DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MMMM/uuuu HH:mm:ss X", Locale.US)
            .withZone(ZoneId.of("Asia/Kolkata"));
        System.out.println(formatter2.format(instant));

        System.out.println(DateTimeFormatter.ISO_DATE.format(localDate));
        System.out.println(DateTimeFormatter.ofPattern("[uuuu-MM-dd]'T'HH:mm:ss.SSS[XXX]").format(ZonedDateTime.now()));

        final DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
        builder.appendPattern("HH:mm:ss");
        builder.appendFraction(ChronoField.NANO_OF_SECOND, 0, 9, true);
        System.out.println(builder.toFormatter().format(LocalTime.now()));
    }
}
