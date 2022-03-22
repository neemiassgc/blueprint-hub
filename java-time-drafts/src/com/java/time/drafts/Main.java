package com.java.time.drafts;

import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {

    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"))
                .withDayOfMonth(18)
                .withMonth(Month.FEBRUARY.getValue())
                .withYear(2018)
                .withHour(10)
                .withMinute(2)
                .withSecond(0);

        System.out.println("Timezone for Sao Paulo");
        System.out.println(zonedDateTime);

        zonedDateTime = zonedDateTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));

        System.out.println("Timezone for Tokyo");
        System.out.println(zonedDateTime);
    }
}
