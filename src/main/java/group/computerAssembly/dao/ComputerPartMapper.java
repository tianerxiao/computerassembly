package group.computerAssembly.dao;

import group.computerAssembly.entity.ComputerPart;
import group.computerAssembly.entity.ComputerPartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComputerPartMapper {
    int deleteByPrimaryKey(String partTableId);

    int insert(ComputerPart record);

    int insertSelective(ComputerPart record);

    List<ComputerPart> selectByExample(ComputerPartExample example);

    ComputerPart selectByPrimaryKey(String partTableId);

    int updateByExampleSelective(@Param("record") ComputerPart record, @Param("example") ComputerPartExample example);

    int updateByExample(@Param("record") ComputerPart record, @Param("example") ComputerPartExample example);

    int updateByPrimaryKeySelective(ComputerPart record);

    int updateByPrimaryKey(ComputerPart record);
}