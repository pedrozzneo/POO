package aula04.exII;

import java.time.LocalTime;

public class Meeting {
    private String description;
    private LocalTime startTime;
    private LocalTime endTime;

    public Meeting(String description, LocalTime startTime, LocalTime endTime){
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
