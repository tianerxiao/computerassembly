package group.computerAssembly.entity;

public class UserRole {
    private String userId;

    private Integer userRole;

    public UserRole(String userId, Integer userRole) {
        this.userId = userId;
        this.userRole = userRole;
    }

    public UserRole() {
        super();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getUserRole() {
        return userRole;
    }

    public void setUserRole(Integer userRole) {
        this.userRole = userRole;
    }
}