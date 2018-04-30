package group.computerAssembly.dao;

import group.computerAssembly.entity.Cpu;
import group.computerAssembly.entity.CpuExample;
import java.util.List;

public interface CpuMapper {
    int deleteByPrimaryKey(Integer cpuId);

    int insert(Cpu record);

    int insertSelective(Cpu record);

    List<Cpu> selectByExampleWithBLOBs(CpuExample example);

    List<Cpu> selectByExample(CpuExample example);

    Cpu selectByPrimaryKey(Integer cpuId);

    int updateByPrimaryKeySelective(Cpu record);

    int updateByPrimaryKeyWithBLOBs(Cpu record);

    int updateByPrimaryKey(Cpu record);
}