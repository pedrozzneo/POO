package aula04.practices.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    static void main() {
        LocalDate date = LocalDate.now();
        System.out.println("date = " + date);

        LocalTime time = LocalTime.now();
        System.out.println("time = " + time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("dateTime = " + dateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm");
        System.out.println(dateTime.format(dateTimeFormatter));

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate christmasDate = LocalDate.of(2026, 12, 25);
        LocalDateTime christmasDateTime = LocalDateTime.of(2026, 12, 25, 16, 40);
        System.out.println("christmasDate = " + christmasDate.format(dateFormatter));
        System.out.println(" chrstimas date time = " + christmasDateTime.format(dateTimeFormatter));

        if(christmasDate.isAfter(date)){
            System.out.println("christimas is after today");
        }
    }
}
