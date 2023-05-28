import java.time.LocalDate;

public class Users {
    private int UserId;
    private String UserName;
    private LocalDate JoinDate;
    private int Banned=0;
    public Users(int userId, String userName) {
        UserId = userId;
        UserName = userName;
        JoinDate = LocalDate.now();
        Banned = 0;
    }
    public int getUserId() {
        return UserId;
    }
    public void setUserId(int userId) {
        UserId=userId;
    }
    public String getUserName() {
        return UserName;
    }
    public void setUserName(String userName) {
        UserName = userName;
    }
    public LocalDate getJoinDate() {
        return JoinDate;
    }
    public int isBanned() {
        return Banned;
    }
    public void Ban()
    {
        if(Banned==0) Banned=1;
    }
    public void UnBan()
    {
        if(Banned==1) Banned=0;
    }
}
