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

    public String getQuote() {
        return quote;
    }

    public LocalDate getDate() {
        return date;
    }

    public UserAccount getUser() {
        return user;
    }

    public int getClaps() {
        return claps;
    }

    public int getBoos() {
        return boos;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setUser(UserAccount user) {
        this.user = user;
    }

    public void setClaps(int claps) {
        this.claps = claps;
    }

    public void setBoos(int boos) {
        this.boos = boos;
    }
}
