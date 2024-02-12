package co.github.martinhermes86;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        //Step 1
        LocalDateTime now = LocalDateTime.now();
        System.out.println("The current time is: " + now);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("eeee.dd.MM.yyyy.HH:mm:ss");
        String formattedDate = now.format(formatter);
        System.out.println("The current time formatted is: " + formattedDate);

        //Step 2
        now = now.plusWeeks(2);
        String formattedDatePlus14 = now.format(formatter);
        System.out.println("The time in 14 days will be: " + formattedDatePlus14);

        //Step 3
        LocalDate futureDate = LocalDate.of(2024, 12, 31);
        if (now.toLocalDate().isBefore(futureDate)) {
            System.out.println("The current date is before the specified future date.");
        } else if (futureDate.isEqual(now.toLocalDate())) {
            System.out.println("The current date is the same as the specified future date.");
        } else {
            System.out.println("The current date is after the specified future date.");
        }

        //Step 4
        LocalDate date1 = LocalDate.of(2024, 1, 1);
        LocalDate date2 = LocalDate.of(2024, 12, 31);

        long daysBetween = ChronoUnit.DAYS.between(date1, date2);
        long monthsBetween = ChronoUnit.MONTHS.between(date1, date2);
        long yearsBetween = ChronoUnit.YEARS.between(date1, date2);

        System.out.println("Difference in days: " + daysBetween);
        System.out.println("Difference in months: " + monthsBetween);
        System.out.println("Difference in years: " + yearsBetween);

        MonthDay newYearsEve = MonthDay.of(12, 31);

        System.out.println("New Year's Eve is on: " + newYearsEve);

        DateTimeFormatter formatterNy = DateTimeFormatter.ofPattern("dd. MMMM");

        String formattedDateNy = newYearsEve.format(formatterNy);
        System.out.println("New Year's Eve is on: " + formattedDateNy);
    }

}