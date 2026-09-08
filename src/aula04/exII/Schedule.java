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

    public static Schedule create(String day, String startTime, String endTime){
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

        LocalDate localDateDay = LocalDate.of(2026, 9, 2);
        LocalTime startLocalTime = LocalTime.of(startHour, startMinutes);
        LocalTime endLocalTime = LocalTime.of(endHour, endMinutes);

        Schedule schedule = new Schedule(localDateDay, startLocalTime, endLocalTime);
        return schedule;
    }

    private Schedule(LocalDate day, LocalTime startTime, LocalTime endTime){
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public boolean timeConflictsWithOtherMeetings(Meeting meeting){
        LocalTime startTime = meeting.getStartTime();
        LocalTime endTime =  meeting.getEndTime();

        for (int i = 0; i < meetingsCount; i++) {
            if (startTime.isAfter(meetings[i].getEndTime()) || endTime.isBefore(meetings[i].getStartTime())){
                continue;
            }
            return true;
        }
        return false;
    }

    public void addMeeting(Meeting meeting){
        if(timeConflictsWithOtherMeetings(meeting)) return;

        if(meetingsCount < maxMeetings && meeting.getStartTime().isAfter(this.startTime) && meeting.getEndTime().isBefore(this.endTime)){
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
