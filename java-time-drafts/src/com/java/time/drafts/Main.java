package com.java.time.drafts;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class Main {

    private Main() {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));

        SimpleDateFormat iso8601 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX", Locale.US);

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        calendar.set(Calendar.YEAR, 2018);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 14);
        calendar.set(Calendar.MINUTE, 30);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        // print the date in ISO8601 format
        Date date = calendar.getTime();
        System.out.println(iso8601.format(date));

        // sum two hours to the date
        final long twoHours = TimeUnit.HOURS.toMillis(2);
        date.setTime(date.getTime() + twoHours);
        
        System.out.println(iso8601.format(date));
    }

    public static void main(String[] args) {
        new Main();

    }
}
