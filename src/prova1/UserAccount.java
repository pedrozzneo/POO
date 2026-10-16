package prova1;

public class UserAccount {
    private String email;
    private String userName;
    private UserAccount[] followers;
    private Post[] timeline;
    private Post[] posts;

    public UserAccount(String email, String userName){
        this.email = email;
        this.userName = userName;
    }
}
