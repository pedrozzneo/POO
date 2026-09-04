package aula04.exII;

public class Main {
    static void main() {
        Schedule schedule = new Schedule("05/06/2023", "09:00", "18:00");
        schedule.addMeeting("test", "10:00", "12:00");
        schedule.addMeeting("test2", "15:00", "16:00");
        schedule.addMeeting("test2", "15:30", "16:30");
        System.out.println(schedule.scheduleAsString());
    }
}
