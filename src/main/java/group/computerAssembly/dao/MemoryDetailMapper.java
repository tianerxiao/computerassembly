package group.computerAssembly.dao;

import group.computerAssembly.entity.MemoryDetail;
import group.computerAssembly.entity.MemoryDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemoryDetailMapper {
    int deleteByExample(MemoryDetailExample example);

    int deleteByPrimaryKey(Integer memdId);

    int insert(MemoryDetail record);

    int insertSelective(MemoryDetail record);

    List<MemoryDetail> selectByExample(MemoryDetailExample example);

    MemoryDetail selectByPrimaryKey(Integer memdId);

    int updateByExampleSelective(@Param("record") MemoryDetail record, @Param("example") MemoryDetailExample example);

    int updateByExample(@Param("record") MemoryDetail record, @Param("example") MemoryDetailExample example);

    int updateByPrimaryKeySelective(MemoryDetail record);

    int updateByPrimaryKey(MemoryDetail record);
}