package group.computerAssembly.dao;

import group.computerAssembly.entity.ComputerOrder;
import group.computerAssembly.entity.ComputerOrderExample;
import java.util.List;

public interface ComputerOrderMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(ComputerOrder record);

    int insertSelective(ComputerOrder record);

    List<ComputerOrder> selectByExample(ComputerOrderExample example);

    ComputerOrder selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(ComputerOrder record);

    int updateByPrimaryKey(ComputerOrder record);
}