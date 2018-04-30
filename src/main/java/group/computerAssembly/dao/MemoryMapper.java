package group.computerAssembly.dao;

import group.computerAssembly.entity.Memory;
import group.computerAssembly.entity.MemoryExample;
import java.util.List;

public interface MemoryMapper {
    int deleteByPrimaryKey(Integer memId);

    int insert(Memory record);

    int insertSelective(Memory record);

    List<Memory> selectByExample(MemoryExample example);

    Memory selectByPrimaryKey(Integer memId);

    int updateByPrimaryKeySelective(Memory record);

    int updateByPrimaryKey(Memory record);
}