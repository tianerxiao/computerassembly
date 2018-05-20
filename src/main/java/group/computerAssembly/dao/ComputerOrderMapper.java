package group.computerAssembly.dao;

import group.computerAssembly.entity.ComputerOrder;
import group.computerAssembly.entity.ComputerOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComputerOrderMapper {
    int deleteByExample(ComputerOrderExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(ComputerOrder record);

    int insertSelective(ComputerOrder record);

    List<ComputerOrder> selectByExample(ComputerOrderExample example);

    ComputerOrder selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") ComputerOrder record, @Param("example") ComputerOrderExample example);

    int updateByExample(@Param("record") ComputerOrder record, @Param("example") ComputerOrderExample example);

    int updateByPrimaryKeySelective(ComputerOrder record);

    int updateByPrimaryKey(ComputerOrder record);
}