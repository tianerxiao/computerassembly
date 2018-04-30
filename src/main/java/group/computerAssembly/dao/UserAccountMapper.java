package group.computerAssembly.dao;

import group.computerAssembly.entity.UserAccount;
import group.computerAssembly.entity.UserAccountExample;
import java.util.List;

public interface UserAccountMapper {
    int deleteByPrimaryKey(String userId);

    int insert(UserAccount record);

    int insertSelective(UserAccount record);

    List<UserAccount> selectByExample(UserAccountExample example);

    UserAccount selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(UserAccount record);

    int updateByPrimaryKey(UserAccount record);
}