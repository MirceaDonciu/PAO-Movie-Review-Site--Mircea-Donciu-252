import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;
public class UserReport extends Report {
    private Users User;
    public UserReport(int reportId, ArrayList<Review> vector, Users user) {
        super(reportId, 1, vector);
        User = user;
    }
    public Users getUserId() {
        return User;
    }
    public void setUserId(Users user) {
        User = user;
    }
    public void getReport()
    {
        System.out.println("Name of User: " + User.getUserName());
        System.out.println("Join Date: " + User.getJoinDate());
        if(User.isBanned()==1) System.out.println("Banned!!!");
        ArrayList<Review> V2 = Vector;
        Collections.sort(V2, new Comparator<Review>() {
            @Override
            public int compare(Review R1, Review R2) {
                if(R1.getReviewScore() < R2.getReviewScore()) return -1;
                if(R1.getReviewScore() == R2.getReviewScore()) return 0;
                return 1;
            }
        });
        int i = 0;
        if(V2.size()==0) return ;
        while (i<V2.size()&&V2.get(i).getUser().getUserId() != User.getUserId()){
            i+=1;
        }
        if(i<V2.size()) System.out.println("Productia cu cel mai mic scor e: " + V2.get(i).getProduction().getName());
        i = V2.size()-1;
        while (i>=0&&V2.get(i).getUser().getUserId() != User.getUserId()){
            i-=1;
        }
        if(i>=0) System.out.println("Productia cu cel mai mare scor e: " + V2.get(i).getProduction().getName());
    }
}
