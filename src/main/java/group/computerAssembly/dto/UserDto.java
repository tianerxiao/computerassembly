package group.computerAssembly.dto;

import group.computerAssembly.entity.UserAccount;
import group.computerAssembly.entity.UserInfo;
import group.computerAssembly.entity.UserRole;

public class UserDto {
    private UserAccount userAccount;
    private UserInfo userInfo;
    private UserRole userRole;

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}
