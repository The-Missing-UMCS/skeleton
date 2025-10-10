package com.demo.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTimeUtils {

    public static boolean isAfter(LocalDateTime a, LocalDateTime b) {
        Asserts.notNull(a, "LocalDateTime a must not be null");
        Asserts.notNull(b, "LocalDateTime b must not be null");
        return a.isAfter(b);
    }

    public static LocalDateTime atStartOfDay(LocalDate localDate) {
        Asserts.notNull(localDate, "LocalDate must not be null");
        return localDate.atStartOfDay();
    }

    public static LocalDateTime atStartOfDay(LocalDateTime localDateTime) {
        Asserts.notNull(localDateTime, "LocalDateTime must not be null");
        return localDateTime.toLocalDate().atStartOfDay();
    }
}
