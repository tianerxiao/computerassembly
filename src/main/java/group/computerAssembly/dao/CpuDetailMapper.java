package group.computerAssembly.dao;

import group.computerAssembly.entity.CpuDetail;
import group.computerAssembly.entity.CpuDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CpuDetailMapper {
    int deleteByExample(CpuDetailExample example);

    int deleteByPrimaryKey(Integer cpudId);

    int insert(CpuDetail record);

    int insertSelective(CpuDetail record);

    List<CpuDetail> selectByExample(CpuDetailExample example);

    CpuDetail selectByPrimaryKey(Integer cpudId);

    int updateByExampleSelective(@Param("record") CpuDetail record, @Param("example") CpuDetailExample example);

    int updateByExample(@Param("record") CpuDetail record, @Param("example") CpuDetailExample example);

    int updateByPrimaryKeySelective(CpuDetail record);

    int updateByPrimaryKey(CpuDetail record);
}