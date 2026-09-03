package aula04.exII;

import java.time.LocalTime;

public class Meeting {
    private String description;
    private LocalTime startTime;
    private LocalTime endTime;

    public Meeting(String description, String startTime, String endTime){
        String[] partsOfStartTime = startTime.split(":");
        int startHour = Integer.parseInt(partsOfStartTime[0]);
        int startMinutes = Integer.parseInt(partsOfStartTime[1]);

        String[] partsOfEndTime = endTime.split(":");
        int endHour = Integer.parseInt(partsOfEndTime[0]);
        int endMinutes = Integer.parseInt(partsOfEndTime[1]);

        LocalTime startLocalTime = LocalTime.of(startHour, startMinutes);
        LocalTime endLocalTime = LocalTime.of(endHour, endMinutes);

        this.description = description;
        this.startTime = startLocalTime;
        this.endTime = endLocalTime;
    }
}
