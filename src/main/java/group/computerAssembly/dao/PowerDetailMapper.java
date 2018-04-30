package group.computerAssembly.dao;

import group.computerAssembly.entity.PowerDetail;
import group.computerAssembly.entity.PowerDetailExample;
import java.util.List;

public interface PowerDetailMapper {
    int deleteByPrimaryKey(Integer powerdId);

    int insert(PowerDetail record);

    int insertSelective(PowerDetail record);

    List<PowerDetail> selectByExample(PowerDetailExample example);

    PowerDetail selectByPrimaryKey(Integer powerdId);

    int updateByPrimaryKeySelective(PowerDetail record);

    int updateByPrimaryKey(PowerDetail record);
}