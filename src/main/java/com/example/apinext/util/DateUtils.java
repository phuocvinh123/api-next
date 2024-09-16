package com.example.apinext.util;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateUtils {
    public static LocalDate parseDate(String dateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(dateString, formatter);
    }

    public static LocalDate convertStringToLocalDate(String dateTimeString) {
        try {
            // Chuyển đổi chuỗi thành OffsetDateTime và sau đó lấy LocalDate
            OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateTimeString);
            return offsetDateTime.toLocalDate();
        } catch (DateTimeParseException e) {
            throw new RuntimeException("Invalid date format: " + dateTimeString);
        }
    }
}
