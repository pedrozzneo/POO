package aula04.exII;

public class Main {
    static void main() {
        Schedule schedule = Schedule.create("05/06/2023", "09:00", "18:00");

        Meeting meeting1 = Meeting.create("test", "10:00", "12:00");
        Meeting meeting2 = Meeting.create("test", "13:00", "14:00");
        Meeting meeting3 = Meeting.create("test", "10:30", "12:30");

        schedule.addMeeting(meeting1);
        schedule.addMeeting(meeting2);
        schedule.addMeeting(meeting3);

        System.out.println(schedule.scheduleAsString());
    }
}
