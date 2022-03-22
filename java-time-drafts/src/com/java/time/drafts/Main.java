package com.java.time.drafts;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {

    public static void main(String[] args) {
        ZonedDateTime parisZonedDateTime = ZonedDateTime.of(2019, 10, 15, 0, 0, 0, 0, ZoneId.of("Europe/Paris"));
        ZonedDateTime tokyoZonedDateTime = ZonedDateTime.of(2019, 10, 15, 7, 0, 0, 0, ZoneId.of("Asia/Tokyo"));

        System.out.println(parisZonedDateTime);
        System.out.println(tokyoZonedDateTime);
        System.out.println("parisZonedDateTime equals to tokyoZonedDateTime: "+parisZonedDateTime.equals(tokyoZonedDateTime));
        System.out.println("parisZonedDateTime is equal to tokyoZonedDateTime: "+parisZonedDateTime.isEqual(tokyoZonedDateTime));

        System.out.println("parisZonedDateTime is before tokyoZonedDateTime: "+parisZonedDateTime.isBefore(tokyoZonedDateTime));
        System.out.println("parisZonedDateTime is after tokyoZonedDateTime: "+parisZonedDateTime.isAfter(tokyoZonedDateTime));
    }
}
