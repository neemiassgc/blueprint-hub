package com.java.time.drafts;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        LocalDate localDateA = LocalDate.of(2019, 10, 6);
        LocalTime localTimeA = LocalTime.of(2, 4, 0);
        LocalDateTime localDateTimeA = LocalDateTime.of(localDateA, localTimeA);

        LocalDate LocalDateB = LocalDate.of(2019, 10, 5);
        LocalTime LocalTimeB = LocalTime.of(22, 30, 0);
        LocalDateTime localDateTimeB = LocalDateTime.of(LocalDateB, LocalTimeB);

        System.out.println("Is localDateTimeA before localDateTimeB? " + localDateTimeA.isBefore(localDateTimeB));
        System.out.println("Is localDateTimeA after localDateTimeB? " + localDateTimeA.isAfter(localDateTimeB));

        final List<LocalDate> listOfDates = new Vector<>();
        listOfDates.add(LocalDate.of(2019, 10, 6));
        listOfDates.add(LocalDate.of(1919, 10, 5));
        listOfDates.add(LocalDate.of(1997, 7, 10));
        listOfDates.add(LocalDate.of(2013, 12, 16));

        System.out.println("\nPrinting list of dates without ordering\n");
        listOfDates.forEach(System.out::println);

        System.out.println("\nPrinting list of dates with ordering\n");
        listOfDates.stream().sorted().forEach(System.out::println);

    }
}
