package prova1;

public class UserAccount {
    private String email;
    private String userName;
    private UserAccount[] followers;
    private Post[] timeline;
    private Post[] posts;
    private int postCount;
    private int followersCount;
    private int timelineCount;

    public UserAccount(String email, String userName){
        this.email = email;
        this.userName = userName;
        this.timeline = new Post[10];
        this.posts = new Post[1000];
        this.followers = new UserAccount[1000];
    }

    public void updateTimeLine(Post post){
        for (int i = 0; i < followersCount; i++) {
            followers[i].timeline[followers[i].timelineCount % 10] = post;
            followers[i].timelineCount++;
        }
    }

    public void publish(String quote){
        Post post = new Post(this, quote);
        posts[postCount] = post;
        postCount++;

        updateTimeLine(post);
    }

    public void acceptFollower(UserAccount userAccount){
        followers[followersCount] = userAccount;
        followersCount++;
    }

    public void blockFollower(UserAccount userAccount){
        for (int i = 0; i < followersCount; i++) {
            if(followers[i].equals(userAccount)){
                for (int j = i; j < followersCount; j++) {
                    followers[j] = followers[j+1];
                }
                break;
            }
        }
    }

    public boolean delete(int idx){
        if(postCount >= idx){
            for (int i = idx; i < postCount; i++) {
                posts[i] = posts[i+1];
            }
            postCount--;
            return true;
        }
        return false;
    }

    public void clapPost(int idx){
        timeline[idx].clap();
    }

    public void booPost(int idx){
        timeline[idx].boo();
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
