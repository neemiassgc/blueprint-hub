package com.java.time.drafts;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.of(2017, 10, 14, 11, 0, 0, 0, ZoneId.of("America/Sao_Paulo"));
        System.out.println("original: "+zonedDateTime);

        zonedDateTime = zonedDateTime.plusHours(24);
        System.out.println("After 24 hours: "+zonedDateTime);

        zonedDateTime = zonedDateTime.minusHours(24);
        System.out.println("Minus 24 hours: "+zonedDateTime);

        zonedDateTime = zonedDateTime.plusDays(1);
        System.out.println("After 1 day: "+zonedDateTime);

        zonedDateTime = zonedDateTime.plus(100, ChronoUnit.WEEKS);
        System.out.println("After 100 weeks: "+zonedDateTime);
    }
}
