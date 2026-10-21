package aula07.practices;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Users {
    private String name;
    private List<Users> followers;

    public Users(String name){
        this.name = name;
        followers = new ArrayList<>();
    }

    public void addFollower(Users user){
        followers.add(user);
    }

    public Iterator<Users> getFollowers(){
        return followers.iterator();
    }

    @Override
    public String toString() {
        return name;
    }

    static void main() {
        Users pedro = new Users("pedro");

        Users lucas = new Users("lucas");
        Users matheus = new Users("matheus");
        Users vitor = new Users("vitor");
        Users felipe = new Users("felipe");

        pedro.addFollower(lucas);
        pedro.addFollower(matheus);
        pedro.addFollower(vitor);
        pedro.addFollower(felipe);

        Iterator<Users> pedroFollowers = pedro.getFollowers();

        while(pedroFollowers.hasNext()){
            System.out.println(pedroFollowers.next());
        }
    }
}
