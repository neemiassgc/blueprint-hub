package com.java.time.drafts;

import java.time.*;
import java.time.zone.ZoneOffsetTransition;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        final ZonedDateTime zonedDateTime = ZonedDateTime.parse("2018-05-04T17:00-03:00[America/Sao_Paulo]");
        final Clock clock = Clock.fixed(zonedDateTime.toInstant(), zonedDateTime.getZone());

        final LocalDate localDate = LocalDate.now(clock);
        System.out.println("LocalDate from clock: " + localDate);

        final OffsetDateTime offsetDateTime = OffsetDateTime.now(clock);
        System.out.println("OffsetDateTime from clock: " + offsetDateTime);

        final List<ZoneOffsetTransition> zoneOffsetTransitionList = ZoneId.of("America/Sao_Paulo").getRules().getTransitions();

        System.out.println("\nThe last five offset transitions: ");
        zoneOffsetTransitionList.stream().skip(zoneOffsetTransitionList.size() - 5).forEach(System.out::println);
    }
}
