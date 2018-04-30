package group.computerAssembly.service.serviceImpl;

import group.computerAssembly.dao.UserAccountMapper;
import group.computerAssembly.dao.UserInfoMapper;
import group.computerAssembly.entity.CpuDetail;
import group.computerAssembly.entity.CpuDetailExample;
import group.computerAssembly.entity.UserAccount;
import group.computerAssembly.service.UserService;
import group.computerAssembly.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = Exception.class)
public class UserServiceImpl implements UserService{

    @Autowired
    UserInfoMapper userInfoMapper;
    @Autowired
    UserAccountMapper userAccountMapper;

    @Override
    public UserAccount findUserById(String userId) {
        return userAccountMapper.selectByPrimaryKey(userId);
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
        String decodePassword = MD5Util.encode(userAccount.getUserPasswd());
        userAccount.setUserPasswd(decodePassword);
        userAccountMapper.insert(userAccount);
    }

}