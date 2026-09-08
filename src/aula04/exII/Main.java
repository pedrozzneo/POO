package aula04.exII;

public class Main {
    static void main() {
        Schedule schedule = Schedule.create("05/06/2023", "09:00", "18:00");

        Meeting meeting1 = Meeting.create("test", "10:00", "13:00");
        long diff = meeting1.durationMinutes();
        Meeting meeting2 = Meeting.create("test", "13:00", "15:00");
        long diff2 = meeting2.durationMinutes();
        Meeting meeting3 = Meeting.create("test", "10:30", "12:30");

        schedule.addMeeting(meeting1);
        schedule.addMeeting(meeting2);
        schedule.addMeeting(meeting3);

        System.out.println(schedule.scheduleAsString());
        schedule.percentageSpentInMeetings();
        schedule.removeMeeting(meeting2);
        System.out.println(schedule.scheduleAsString());
    }
}
