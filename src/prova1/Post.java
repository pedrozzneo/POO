package prova1;

import java.time.LocalDate;

public class Post {
    private String quote;
    private LocalDate date;
    private UserAccount user;
    private int claps;
    private int boos;

    Post(UserAccount userAccount, String quote){
        this.date = LocalDate.now();
        this.quote = quote;
        this.user = user;
    }
}
