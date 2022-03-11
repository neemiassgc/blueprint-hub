package com.java.time.drafts;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Tokyo"));
        Locale.setDefault(Locale.US);

	    final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE dd/MM/yyyy HH:mm:ss");
        final Calendar calendar = Calendar.getInstance();
        System.out.println(simpleDateFormat.format(calendar.getTime()));

        final SimpleDateFormat iso8601DateFormatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        System.out.println(iso8601DateFormatter.format(calendar.getTime()));
    }
}
