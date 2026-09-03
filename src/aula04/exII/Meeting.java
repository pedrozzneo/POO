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

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public String getStartTimeAsString(){
        return String.format("%d:%d", startTime.getHour(), startTime.getMinute());
    }

    public String getEndTimeAsString(){
        return String.format("%d:%d", endTime.getHour(), endTime.getMinute());
    }
}
