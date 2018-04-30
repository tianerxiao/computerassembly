package group.computerAssembly.dao;

import group.computerAssembly.entity.Power;
import group.computerAssembly.entity.PowerExample;
import java.util.List;

public interface PowerMapper {
    int deleteByPrimaryKey(Integer powerId);

    int insert(Power record);

    int insertSelective(Power record);

    List<Power> selectByExampleWithBLOBs(PowerExample example);

    List<Power> selectByExample(PowerExample example);

    Power selectByPrimaryKey(Integer powerId);

    int updateByPrimaryKeySelective(Power record);

    int updateByPrimaryKeyWithBLOBs(Power record);

    int updateByPrimaryKey(Power record);
}