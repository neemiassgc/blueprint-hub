package com.java.time.drafts;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) {
        final ExecutorService executorservice = Executors.newCachedThreadPool();
        final String input = "01/01/2020";

        for (int i = 0; i < 100; i++) {
            executorservice.submit(() -> {
                synchronized(simpleDateFormat) {
                    try {
                        Date date = simpleDateFormat.parse(input);
                        String formattedInput = simpleDateFormat.format(date);

                        if (!input.equals(formattedInput)) {
                            System.out.println(input+" != "+formattedInput);
                        }

                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}
