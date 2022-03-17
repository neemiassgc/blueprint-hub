package com.java.time.drafts;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"));

        SimpleDateFormat iso8601 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX", Locale.US);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2018);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 31);
        calendar.set(Calendar.HOUR_OF_DAY, 10);
        calendar.set(Calendar.MINUTE, 30);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        // print the date in ISO8601 format
        System.out.println("Actual date: "+ iso8601.format(calendar.getTime()));

        // sum one month to the date
        calendar.add(Calendar.MONTH, 1);

        // print the date in ISO8601 format
        System.out.println("Sum one month: "+ iso8601.format(calendar.getTime()));

        // subtract one month to the date
        calendar.add(Calendar.MONTH, -1);
        System.out.println("Subtract one month: "+ iso8601.format(calendar.getTime()));

        // add two year to the date
        calendar.add(Calendar.YEAR, 2);
        System.out.println("Add two year: "+ iso8601.format(calendar.getTime()));

        // subtract three hours to the date
        calendar.add(Calendar.HOUR, -3);
        System.out.println("Subtract three hours: "+ iso8601.format(calendar.getTime()));
    }
}
