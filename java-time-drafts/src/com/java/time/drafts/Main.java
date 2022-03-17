package com.java.time.drafts;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        final TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
        final Calendar cal = Calendar.getInstance(tz, Locale.US);

        System.out.println("Timezone id: "+tz.getID());
        System.out.println("Timezone name: "+tz.getDisplayName(Locale.US));
        System.out.println("Timezone offset: "+ TimeUnit.HOURS.convert(tz.getOffset(cal.getTimeInMillis()), TimeUnit.MILLISECONDS));
        System.out.println("Raw offset: "+ TimeUnit.HOURS.convert(tz.getRawOffset(), TimeUnit.MILLISECONDS));
        System.out.println("is it daylight savings time? "+tz.inDaylightTime(cal.getTime()));

        final long twoHoursInMillis = TimeUnit.HOURS.toMillis(2);
        Stream.of(TimeZone.getAvailableIDs()).forEach(id -> {
            final long offset = TimeZone.getTimeZone(id).getOffset(cal.getTimeInMillis());
            if (offset == twoHoursInMillis) System.out.println(id);
        });
    }
}
