package prova1;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    static void main() {
        UserAccount pedrozzneo = new UserAccount("pedrozzneo@gmail.com", "pedrozzneo");
        UserAccount val = new UserAccount("val@gmail.com", "val");
        UserAccount val2 = new UserAccount("val2@gmail.com", "val2");
        UserAccount val3 = new UserAccount("val3@gmail.com", "val3");
        UserAccount val4 = new UserAccount("val4@gmail.com", "val4");
        pedrozzneo.acceptFollower(val);
        pedrozzneo.acceptFollower(val2);
        pedrozzneo.acceptFollower(val3);
        pedrozzneo.acceptFollower(val4);

        for (int i = 0; i < 15; i++) {
            pedrozzneo.publish(i + "hurdur");
        }

        //pedrozzneo.delete(3);

        val.clapPost(4);
        val.booPost(4);

        pedrozzneo.blockFollower(val2);
    }

}
