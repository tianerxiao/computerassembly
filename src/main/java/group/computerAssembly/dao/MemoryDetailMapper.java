package group.computerAssembly.dao;

import group.computerAssembly.entity.MemoryDetail;
import group.computerAssembly.entity.MemoryDetailExample;
import java.util.List;

public interface MemoryDetailMapper {
    int deleteByPrimaryKey(Integer memdId);

    int insert(MemoryDetail record);

    int insertSelective(MemoryDetail record);

    List<MemoryDetail> selectByExample(MemoryDetailExample example);

    MemoryDetail selectByPrimaryKey(Integer memdId);

    int updateByPrimaryKeySelective(MemoryDetail record);

    int updateByPrimaryKey(MemoryDetail record);
}