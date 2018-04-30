package group.computerAssembly.dto;

import group.computerAssembly.entity.UserAccount;
import group.computerAssembly.entity.UserInfo;

public class UserDto {
    private UserAccount userAccount;
    private UserInfo userInfo;

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
