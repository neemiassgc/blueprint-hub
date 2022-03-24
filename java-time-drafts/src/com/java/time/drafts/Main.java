package com.java.time.drafts;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalQuery;

public class Main {

    private TemporalQuery<Boolean> isMorning() {
        return temporal -> {
          if (temporal.get(ChronoField.HOUR_OF_DAY) >= 0 && temporal.get(ChronoField.HOUR_OF_DAY) < 12) {
              return temporal.get(ChronoField.MINUTE_OF_HOUR) >= 0 && temporal.get(ChronoField.MINUTE_OF_HOUR) < 59;
          }
          return false;
        };
    }

    private TemporalQuery<Boolean> isAfternoon() {
        return temporal -> {
          if (temporal.get(ChronoField.HOUR_OF_DAY) >= 12 && temporal.get(ChronoField.HOUR_OF_DAY) < 18) {
              return temporal.get(ChronoField.MINUTE_OF_HOUR) >= 0 && temporal.get(ChronoField.MINUTE_OF_HOUR) < 59;
          }
          return false;
        };
    }

    private TemporalQuery<Boolean> isEvening() {
        return temporal -> {
          if (temporal.get(ChronoField.HOUR_OF_DAY) >= 18 && temporal.get(ChronoField.HOUR_OF_DAY) < 24) {
              return temporal.get(ChronoField.MINUTE_OF_HOUR) >= 0 && temporal.get(ChronoField.MINUTE_OF_HOUR) < 59;
          }
          return false;
        };
    }

    private Main() {
        Instant instant = Instant.now();
        System.out.println("millis: " + instant.toEpochMilli());
        System.out.println("seconds: " + instant.getEpochSecond());

        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.systemDefault());
        System.out.println(zonedDateTime);
        System.out.println("Hours slept since midnight: " + localDateTime.get(ChronoField.HOUR_OF_DAY));

        if (zonedDateTime.isSupported(ChronoField.MINUTE_OF_HOUR)) {
            if (zonedDateTime.range(ChronoField.MINUTE_OF_HOUR).isIntValue())
                System.out.println("Minutes slept since current hour: " + zonedDateTime.get(ChronoField.MINUTE_OF_HOUR));
            else
                System.out.println("Minutes slept since current hour: " + zonedDateTime.getLong(ChronoField.MINUTE_OF_HOUR));
        }

        System.out.println("Is morning: " + zonedDateTime.query(this.isMorning()));
        System.out.println("Is afternoon: " + zonedDateTime.query(this.isAfternoon()));
        System.out.println("Is evening: " + zonedDateTime.query(this.isEvening()));
    }

    public static void main(String[] args) {
        new Main();
    }
}
