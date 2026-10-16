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
        this.timeline = new Post[10];
        this.posts = new Post[1000];
        this.followers = new UserAccount[1000];
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public UserAccount[] getFollowers() {
        return followers;
    }

    public Post[] getTimeline() {
        return timeline;
    }

    public Post[] getPosts() {
        return posts;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setFollowers(UserAccount[] followers) {
        this.followers = followers;
    }

    public void setTimeline(Post[] timeline) {
        this.timeline = timeline;
    }

    public void setPosts(Post[] posts) {
        this.posts = posts;
    }
}
