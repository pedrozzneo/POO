package aula04.exII;

import java.time.LocalDate;
import java.time.LocalTime;

public class Schedule {
    private LocalDate day;
    private LocalTime startTime;
    private LocalTime endTime;

    public Schedule(String day, String startTime, String endTime){
        String[] partsOfDay = day.split("/");
        int year = Integer.parseInt(partsOfDay[0]);
        int month = Integer.parseInt(partsOfDay[1]);
        int dayOfDate = Integer.parseInt(partsOfDay[2]);
        LocalDate localDate = LocalDate.of(2026, 9, 2);

        this.day = localDate;
    }

    public String scheduleAsString(){
        return String.format("%d/%d/%d", day.getDayOfMonth(), day.getMonthValue(), day.getYear());
    }
}
