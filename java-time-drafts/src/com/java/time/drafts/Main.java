package com.java.time.drafts;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Main {

    private static void lineSeparator(final String message) {
        System.out.println("-".repeat(10)+message+"-".repeat(10));
    }

    public static void main(String[] args) throws ParseException {
	// write your code here
        final SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
        final String dateString = "2002-03-12T11:09:00-03:00";
        System.out.println(dateFormatter.parse(dateString));
        System.out.println(dateFormatter.parse(dateString).getTime());

        // parsing with locale
        lineSeparator("Parsing with locale");
        final Date actualDate = Calendar.getInstance().getTime();
        final String formattedDate = new SimpleDateFormat("MMMM dd/MM/yyyy HH:mm", Locale.US).format(actualDate);
        System.out.println(formattedDate);
        final Date parsedDate = new SimpleDateFormat("MMMM dd/MM/yyyy HH:mm", Locale.US).parse(formattedDate);
        System.out.println(parsedDate);
    }
}
