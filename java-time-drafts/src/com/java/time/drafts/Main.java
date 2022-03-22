package com.java.time.drafts;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("Europe/Paris");
        LocalDateTime localDateTime = LocalDateTime.now(zoneId);
        System.out.println(localDateTime);

        System.out.println("Dealing with gaps");
        ZonedDateTime gapZonedDateTime = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
        gapZonedDateTime = gapZonedDateTime
            .withDayOfMonth(15)
            .withMonth(Month.OCTOBER.getValue())
            .withYear(2017)
            .withHour(0)
            .withMinute(0)
            .withSecond(0);

        System.out.println(gapZonedDateTime+"\n");

        System.out.println("Dealing with overlaps");
        ZonedDateTime overlapZonedDateTime = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"))
            .withDayOfMonth(18)
            .withMonth(Month.FEBRUARY.getValue())
            .withYear(2018)
            .withHour(0)
            .withMinute(0)
            .withSecond(0);

        System.out.println(overlapZonedDateTime);
        System.out.println(overlapZonedDateTime.getZone()+" "+overlapZonedDateTime.getOffset());
    }
}
