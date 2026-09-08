package aula04.exII;

import java.time.LocalTime;

public class Meeting {
    private String description;
    private LocalTime startTime;
    private LocalTime endTime;

    private Meeting(String description, LocalTime startTime, LocalTime endTime){
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public static Meeting create(String description, String startTime, String endTime){
        String[] partsOfStartTime = startTime.split(":");
        int startHour = Integer.parseInt(partsOfStartTime[0]);
        int startMinutes = Integer.parseInt(partsOfStartTime[1]);

        String[] partsOfEndTime = endTime.split(":");
        int endHour = Integer.parseInt(partsOfEndTime[0]);
        int endMinutes = Integer.parseInt(partsOfEndTime[1]);

        LocalTime startLocalTime = LocalTime.of(startHour, startMinutes);
        LocalTime endLocalTime = LocalTime.of(endHour, endMinutes);

        Meeting meeting = new Meeting(description, startLocalTime, endLocalTime);
        return meeting;
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

    public long durationMinutes(){
        int startSecondsTotal = startTime.getSecond() + (startTime.getMinute()*60) + (startTime.getHour()*60*60);
        int endSecondsTotal = endTime.getSecond() + (endTime.getMinute()*60) + (endTime.getHour()*60*60);

        int durationSeconds = endSecondsTotal - startSecondsTotal;
        long durationMinutes = (long) (durationSeconds/60);

        return durationMinutes;
    }
}
