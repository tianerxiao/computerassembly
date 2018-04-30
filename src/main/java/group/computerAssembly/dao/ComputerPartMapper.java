package group.computerAssembly.dao;

import group.computerAssembly.entity.ComputerPart;
import group.computerAssembly.entity.ComputerPartExample;
import java.util.List;

public interface ComputerPartMapper {
    int deleteByPrimaryKey(String userId);

    int insert(ComputerPart record);

    int insertSelective(ComputerPart record);

    List<ComputerPart> selectByExample(ComputerPartExample example);

    ComputerPart selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(ComputerPart record);

    int updateByPrimaryKey(ComputerPart record);
}