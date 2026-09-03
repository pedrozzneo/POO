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

    public String getDescription(){
        return description;
    }

    public String getStartTime(){
        return String.format("%d:%d", startTime.getHour(), startTime.getMinute());
    }

    public String getEndTime(){
        return String.format("%d:%d", endTime.getHour(), endTime.getMinute());
    }
}
