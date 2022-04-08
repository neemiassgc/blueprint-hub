package com.java.time.drafts;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
	final LocalDateTime localDateTime1 = LocalDateTime.parse("2017-08-10T05:00:00");
    final LocalDateTime localDateTime2 = LocalDateTime.parse("2017-09-10T03:00:00");

    final long hoursBetween = ChronoUnit.HOURS.between(localDateTime1, localDateTime2);
    final Duration daysBetween = Duration.between(localDateTime1, localDateTime2);
    final Period monthsBetween = Period.between(localDateTime1.toLocalDate(), localDateTime2.toLocalDate());

        System.out.printf(
            "Hours between %s and %s is %d %s\n",
            localDateTime1,
            localDateTime2,
            hoursBetween,
            "hour"+(hoursBetween == 1 ? "" : "s")
        );

        System.out.printf(
            "Days between %s and %s is %d %s\n",
            localDateTime1,
            localDateTime2,
            daysBetween.toDays(),
            "day"+(daysBetween.toDays() == 1 ? "" : "s")
        );

        System.out.printf(
            "Months between %s and %s is %d %s\n",
            localDateTime1,
            localDateTime2,
            monthsBetween.getMonths(),
            "month"+(monthsBetween.getMonths() == 1 ? "" : "s")
        );
    }
}
