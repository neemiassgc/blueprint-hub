package com.java.time.drafts;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"));

        LocalTime localTime = LocalTime.of(12, 30, 45, (int) (123 * 1e6));
        LocalDateTime localDateTime = LocalDateTime.now();
        final int dayOfMonth = localDateTime.getDayOfMonth();
        final int dayOfYear = localDateTime.getDayOfYear();
        final int year = localDateTime.getYear();
        final int hour = localDateTime.getHour();
        final int minute = localDateTime.getMinute();
        final Month month = localDateTime.getMonth();
        final DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();

        System.out.println("Custom localTime: "+localTime);
        System.out.println("localDateTime now: "+localDateTime);
        System.out.println("dayOfMonth now: "+dayOfMonth);
        System.out.println("dayOfYear now: "+dayOfYear);
        System.out.println("year now: "+year);
        System.out.println("hour now: "+hour);
        System.out.println("minute now: "+minute);
        System.out.println("month now: "+month);
        System.out.println("dayOfWeek now: "+dayOfWeek);

    }
}
