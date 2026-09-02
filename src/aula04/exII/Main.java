package aula04.exII;

public class Main {
    static void main() {
        Schedule schedule = new Schedule("05/06/2023", "09:00", "18:00");
        System.out.println(schedule.scheduleAsString());
    }
}
