package com.java.time.drafts;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) throws ParseException {
	    SimpleDateFormat iso8601Formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mmXXX");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm XXX");
        formatter.setTimeZone(TimeZone.getTimeZone("UTC"));

        String iso8601Date = "2018-02-01T17:30Z";
        Date parsedDate = iso8601Formatter.parse(iso8601Date);
        System.out.println(formatter.format(parsedDate));
    }
}
