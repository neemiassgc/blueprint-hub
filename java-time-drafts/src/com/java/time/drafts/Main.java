package com.java.time.drafts;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;

public class Main {

    private static void printTheFields(final LocalDateTime localDateTime) {
        System.out.println("Year: " + localDateTime.getYear());
        System.out.println("Month: " + localDateTime.getMonth());
        System.out.println("Day of month: " + localDateTime.getDayOfMonth());
        System.out.println("Day of week: " + localDateTime.getDayOfWeek());
    }

    public static void main(String[] args) {
	// write your code here
        final LocalDate localDate = LocalDate.of(2018, 10,  16);
        final LocalTime localTime = LocalTime.of(12, 30, 45);
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);

        localDateTime = localDateTime
            .withYear(2019)
            .withMonth(11)
            .with(TemporalAdjusters.lastDayOfMonth());

        printTheFields(localDateTime);

        localDateTime = localDateTime.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println("\nAfter modifying to next saturday\n");

        printTheFields(localDateTime);

        localDateTime = localDateTime.with(TemporalAdjusters.dayOfWeekInMonth(4, DayOfWeek.WEDNESDAY));

        System.out.println("\nAfter modifying to 4th wednesday of the month\n");

        printTheFields(localDateTime);

    }
}
