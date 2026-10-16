package prova1;

import java.time.LocalDate;

public class Post {
    private String quote;
    private LocalDate date;
    private UserAccount userAccount;
    private int claps;
    private int boos;

    Post(UserAccount userAccount, String quote){
        this.date = LocalDate.now();
        this.quote = quote;
        this.userAccount = userAccount;
    }

    public void show(){
        System.out.printf(" [%s] %s says \"%s\" | Claps: %d | Boos: %d.%n"
                , date.toString(),
                userAccount.getUserName(),
                quote,
                claps,
                boos);
    }

    public void clap(){
        claps++;
    }

    public void boo(){
        boos++;
    }

    public String getQuote() {
        return quote;
    }

    public LocalDate getDate() {
        return date;
    }

    public UserAccount getUser() {
        return userAccount;
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
        this.userAccount = user;
    }
}
