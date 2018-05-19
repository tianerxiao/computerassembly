package group.computerAssembly.dao;

import group.computerAssembly.entity.Memory;
import group.computerAssembly.entity.MemoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemoryMapper {
    int deleteByExample(MemoryExample example);

    int deleteByPrimaryKey(Integer memId);

    int insert(Memory record);

    int insertSelective(Memory record);

    List<Memory> selectByExample(MemoryExample example);

    Memory selectByPrimaryKey(Integer memId);

    int updateByExampleSelective(@Param("record") Memory record, @Param("example") MemoryExample example);

    int updateByExample(@Param("record") Memory record, @Param("example") MemoryExample example);

    int updateByPrimaryKeySelective(Memory record);

    int updateByPrimaryKey(Memory record);
}