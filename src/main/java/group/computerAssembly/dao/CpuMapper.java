package group.computerAssembly.dao;

import group.computerAssembly.entity.Cpu;
import group.computerAssembly.entity.CpuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CpuMapper {
    int deleteByExample(CpuExample example);

    int deleteByPrimaryKey(Integer cpuId);

    int insert(Cpu record);

    int insertSelective(Cpu record);

    List<Cpu> selectByExample(CpuExample example);

    Cpu selectByPrimaryKey(Integer cpuId);

    int updateByExampleSelective(@Param("record") Cpu record, @Param("example") CpuExample example);

    int updateByExample(@Param("record") Cpu record, @Param("example") CpuExample example);

    int updateByPrimaryKeySelective(Cpu record);

    int updateByPrimaryKey(Cpu record);
}