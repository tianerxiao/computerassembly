package group.computerAssembly.service;

import group.computerAssembly.dto.UserDto;
import group.computerAssembly.entity.UserAccount;
import group.computerAssembly.entity.UserInfo;
import group.computerAssembly.entity.UserRole;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    UserDto findUserById(String userId);
    boolean matchPassword(UserAccount userAccount);
    void addNewUser(UserAccount userAccount);
    void modifyPassword(UserAccount userAccount,String newPassword);
    void updateUserInfo(UserInfo userInfo);
    UserRole getUserRole(String userId);
    List<UserDto> getUserList();
}
