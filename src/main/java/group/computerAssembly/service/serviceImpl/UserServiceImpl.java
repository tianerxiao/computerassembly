package group.computerAssembly.service.serviceImpl;

import group.computerAssembly.dao.UserAccountMapper;
import group.computerAssembly.dao.UserInfoMapper;
import group.computerAssembly.dao.UserRoleMapper;
import group.computerAssembly.dto.UserDto;
import group.computerAssembly.entity.*;
import group.computerAssembly.service.UserService;
import group.computerAssembly.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
public class UserServiceImpl implements UserService{

    @Autowired
    UserInfoMapper userInfoMapper;
    @Autowired
    UserAccountMapper userAccountMapper;
    @Autowired
    UserRoleMapper userRoleMapper;

    @Override
    public UserDto findUserById(String userId) {
        UserDto userDto = new UserDto();
        userDto.setUserAccount(userAccountMapper.selectByPrimaryKey(userId));
        userDto.setUserInfo(userInfoMapper.selectByPrimaryKey(userId));
        userDto.setUserRole(userRoleMapper.selectByPrimaryKey(userId));
        if(userDto.getUserAccount() != null){
            userDto.getUserAccount().setUserPasswd("");
        }
        return userDto;
    }

    @Override
    public boolean matchPassword(UserAccount userAccount) {
        if(userAccountMapper.selectByPrimaryKey(userAccount.getUserId())==null){
            return false;
        }
        if (MD5Util.encode(userAccount.getUserPasswd())
                .equals(userAccountMapper.selectByPrimaryKey(userAccount.getUserId())
                        .getUserPasswd())){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void addNewUser(UserAccount userAccount) {
        UserInfo userInfo =  new UserInfo();
        UserRole userRole = new UserRole();
        userRole.setUserId(userAccount.getUserId());
        userRole.setUserRole(1);
        userInfo.setUserId(userAccount.getUserId());
        userInfo.setUserEmail("");
        userInfo.setUserName("");
        userInfo.setUserPhone("");
        String decodePassword = MD5Util.encode(userAccount.getUserPasswd());
        userAccount.setUserPasswd(decodePassword);
        userAccountMapper.insert(userAccount);
        userInfoMapper.insert(userInfo);
        userRoleMapper.insert(userRole);
    }

    @Override
    public void modifyPassword(UserAccount userAccount, String newPassword) {
        userAccount.setUserPasswd(MD5Util.encode(newPassword));
        userAccountMapper.updateByPrimaryKeySelective(userAccount);
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        userInfoMapper.updateByPrimaryKeySelective(userInfo);
    }

    @Override
    public UserRole getUserRole(String userId) {
        return userRoleMapper.selectByPrimaryKey(userId);
    }

    @Override
    public List<UserDto> getUserList() {
        List<UserDto> userDtoList = new ArrayList<UserDto>();
        UserAccountExample example = new UserAccountExample();
        UserAccountExample.Criteria criteria= example.createCriteria();
        criteria.andUserIdIsNotNull();
        List<UserAccount> userAccountList = userAccountMapper.selectByExample(example);
        for (UserAccount userAccount:userAccountList){
            UserDto userDto = new UserDto();
            userDto.setUserInfo(userInfoMapper.selectByPrimaryKey(userAccount.getUserId()));
            userDto.setUserAccount(userAccount);
            userDtoList.add(userDto);
        }
        return userDtoList;
    }

    @Override
    public void updateUserRole(String userId,Integer role) {
        UserRole userRole = new UserRole();
        userRole.setUserRole(role);
        userRole.setUserId(userId);
        userRoleMapper.updateByPrimaryKey(userRole);
    }
}