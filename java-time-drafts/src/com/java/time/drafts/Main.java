package com.java.time.drafts;

import java.time.Duration;
import java.time.Period;

public class Main {

    public static void main(String[] args) {
        final String periodExpression = "P18Y3M";
        final Period period = Period.parse(periodExpression);
        final Period oneHundredWeeks = Period.ofWeeks(100);
        System.out.println("Sum of the months: "+period.toTotalMonths());
        System.out.println(period);

        System.out.println("After 100 weeks");
        System.out.printf("%s + %s = %s%n", period, oneHundredWeeks, period.plus(oneHundredWeeks));

        final Duration duration = Duration.ZERO
                .plusDays(1)
                .plusHours(3)
                .plusMinutes(35)
                .plusMillis(15700);

        System.out.println("Duration: "+duration);
    }
}
