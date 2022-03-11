package com.java.time.drafts;

import java.util.Calendar;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) {
	// write your code here

        final Calendar calendarSaoPaulo = Calendar.getInstance(TimeZone.getTimeZone("America/Sao_Paulo"));
        final Calendar calendarLondon = Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        final Calendar calendarNewYork = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));
        final Calendar calendarTokyo = Calendar.getInstance(TimeZone.getTimeZone("Asia/Tokyo"));

        calendarSaoPaulo.set(Calendar.YEAR, 2002);
        calendarSaoPaulo.set(Calendar.MONTH, Calendar.MAY);
        calendarSaoPaulo.set(Calendar.DAY_OF_MONTH, 15);
        calendarSaoPaulo.set(Calendar.HOUR_OF_DAY, 12);

        calendarLondon.set(Calendar.YEAR, 2002);
        calendarLondon.set(Calendar.MONTH, Calendar.MAY);
        calendarLondon.set(Calendar.DAY_OF_MONTH, 15);
        calendarLondon.set(Calendar.HOUR_OF_DAY, 12);

        calendarNewYork.set(Calendar.YEAR, 2002);
        calendarNewYork.set(Calendar.MONTH, Calendar.MAY);
        calendarNewYork.set(Calendar.DAY_OF_MONTH, 15);
        calendarNewYork.set(Calendar.HOUR_OF_DAY, 12);

        calendarTokyo.set(Calendar.YEAR, 2002);
        calendarTokyo.set(Calendar.MONTH, Calendar.MAY);
        calendarTokyo.set(Calendar.DAY_OF_MONTH, 15);
        calendarTokyo.set(Calendar.HOUR_OF_DAY, 12);

        System.out.println("#".repeat(30));

        System.out.println("São Paulo: " + calendarSaoPaulo.getTime());
        System.out.println("London: " + calendarLondon.getTime());
        System.out.println("New York: " + calendarNewYork.getTime());
        System.out.println("Tokyo: " + calendarTokyo.getTime());

        System.out.println("#".repeat(30));

        System.out.println(calendarSaoPaulo);
        System.out.println(calendarLondon);
        System.out.println(calendarNewYork);
        System.out.println(calendarTokyo);

        System.out.println("#".repeat(30));

        System.out.println("São Paulo: " + calendarSaoPaulo.getTimeInMillis());
        System.out.println("London: " + calendarLondon.getTimeInMillis());
        System.out.println("New York: " + calendarNewYork.getTimeInMillis());
        System.out.println("Tokyo: " + calendarTokyo.getTimeInMillis());
    }
}
