package com.java.time.drafts;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"));

        SimpleDateFormat iso8601 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX", Locale.US);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2017);
        calendar.set(Calendar.MONTH, Calendar.OCTOBER);
        calendar.set(Calendar.DAY_OF_MONTH, 14);
        calendar.set(Calendar.HOUR_OF_DAY, 10);
        calendar.set(Calendar.MINUTE, 30);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        // print the date in ISO8601 format
        System.out.println(iso8601.format(calendar.getTime()));

        final long timestampBefore = calendar.getTimeInMillis();

        // sum one day to the date
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        System.out.println(iso8601.format(calendar.getTime()));

        // Calculate the difference between two dates
        final long timestampAfter = calendar.getTimeInMillis();

        // Calculate the difference in milliseconds
        final long differenceInMillis = timestampAfter - timestampBefore;

        // Calculate the difference in Hours and print it
        final long differenceInHours = TimeUnit.HOURS.convert(differenceInMillis, TimeUnit.MILLISECONDS);
        System.out.println("Difference in hours: " + differenceInHours);

    }
}
