package group.computerAssembly.service;

import group.computerAssembly.dto.UserDto;
import group.computerAssembly.entity.CpuDetail;
import group.computerAssembly.entity.UserAccount;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    UserDto findUserById(String userId);
    boolean matchPassword(UserAccount userAccount);
    void addNewUser(UserAccount userAccount);
}
