package aula04.exII;

import java.time.LocalDate;
import java.time.LocalTime;

public class Schedule {
    private LocalDate day;
    private LocalTime startTime;
    private LocalTime endTime;
    private int maxMeetings = 10;
    private Meeting[] meetings = new Meeting[maxMeetings];
    private static int meetingsCount = 0;

    public Schedule(String day, String startTime, String endTime){
        String[] partsOfDay = day.split("/");
        int year = Integer.parseInt(partsOfDay[0]);
        int month = Integer.parseInt(partsOfDay[1]);
        int dayOfDate = Integer.parseInt(partsOfDay[2]);

        String[] partsOfStartTime = startTime.split(":");
        int startHour = Integer.parseInt(partsOfStartTime[0]);
        int startMinutes = Integer.parseInt(partsOfStartTime[1]);

        String[] partsOfEndTime = endTime.split(":");
        int endHour = Integer.parseInt(partsOfEndTime[0]);
        int endMinutes = Integer.parseInt(partsOfEndTime[1]);

        LocalDate localDate = LocalDate.of(2026, 9, 2);
        LocalTime startLocalTime = LocalTime.of(startHour, startMinutes);
        LocalTime endLocalTime = LocalTime.of(endHour, endMinutes);

        this.day = localDate;
        this.startTime = startLocalTime;
        this.endTime = endLocalTime;
    }

    public boolean timeConflictsWithOtherMeetings(LocalTime startTime, LocalTime endTime){
        for (int i = 0; i < meetingsCount; i++) {
            if (startTime.isAfter(meetings[i].getEndTime()) || endTime.isBefore(meetings[i].getStartTime())){
                continue;
            }
            return true;
        }
        return false;
    }

    public void addMeeting(String description, String startTime, String endTime){
        String[] partsOfStartTime = startTime.split(":");
        int startHour = Integer.parseInt(partsOfStartTime[0]);
        int startMinutes = Integer.parseInt(partsOfStartTime[1]);

        String[] partsOfEndTime = endTime.split(":");
        int endHour = Integer.parseInt(partsOfEndTime[0]);
        int endMinutes = Integer.parseInt(partsOfEndTime[1]);

        LocalTime startLocalTime = LocalTime.of(startHour, startMinutes);
        LocalTime endLocalTime = LocalTime.of(endHour, endMinutes);

        if(timeConflictsWithOtherMeetings(startLocalTime, endLocalTime)) return;

        if(meetingsCount < maxMeetings && startLocalTime.isAfter(this.startTime) && endLocalTime.isBefore(this.endTime)){
            Meeting meeting = new Meeting(description, startLocalTime, endLocalTime);
            meetings[meetingsCount] = meeting;
            meetingsCount++;
        }
    }

    public String printMeetings(){
        if(meetingsCount == 0) return "";

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < meetingsCount; i++) {
            stringBuilder.append
                (meetings[i].getStartTimeAsString()).append
                ("-").append
                (meetings[i].getEndTimeAsString()).append
                (": ").append
                (meetings[i].getDescription()).append
                ("\n");
        }

        return stringBuilder.toString();
    }
    public String scheduleAsString(){
        String scheduleAsString = String.format(
                "%d/%d/%d from %d:%d to %d:%d\n\nMeetings:\n",
                day.getDayOfMonth(), day.getMonthValue(), day.getYear(),
                startTime.getHour(), startTime.getMinute(),
                endTime.getHour(), endTime.getMinute()
        );

        scheduleAsString += printMeetings();
        return scheduleAsString;
    }
}
