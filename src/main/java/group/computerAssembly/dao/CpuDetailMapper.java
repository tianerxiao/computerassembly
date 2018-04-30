package group.computerAssembly.dao;

import group.computerAssembly.entity.CpuDetail;
import group.computerAssembly.entity.CpuDetailExample;
import java.util.List;

public interface CpuDetailMapper {
    int deleteByPrimaryKey(Integer cpudId);

    int insert(CpuDetail record);

    int insertSelective(CpuDetail record);

    List<CpuDetail> selectByExample(CpuDetailExample example);

    CpuDetail selectByPrimaryKey(Integer cpudId);

    int updateByPrimaryKeySelective(CpuDetail record);

    int updateByPrimaryKey(CpuDetail record);
}