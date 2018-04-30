package group.computerAssembly.entity;

public class UserAccount {
    private String userId;

    private String userPasswd;

    public UserAccount(String userId, String userPasswd) {
        this.userId = userId;
        this.userPasswd = userPasswd;
    }

    public UserAccount() {
        super();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserPasswd() {
        return userPasswd;
    }

    public void setUserPasswd(String userPasswd) {
        this.userPasswd = userPasswd == null ? null : userPasswd.trim();
    }
}