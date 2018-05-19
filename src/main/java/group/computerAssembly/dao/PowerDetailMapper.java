package group.computerAssembly.dao;

import group.computerAssembly.entity.PowerDetail;
import group.computerAssembly.entity.PowerDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PowerDetailMapper {
    int deleteByExample(PowerDetailExample example);

    int deleteByPrimaryKey(Integer powerdId);

    int insert(PowerDetail record);

    int insertSelective(PowerDetail record);

    List<PowerDetail> selectByExample(PowerDetailExample example);

    PowerDetail selectByPrimaryKey(Integer powerdId);

    int updateByExampleSelective(@Param("record") PowerDetail record, @Param("example") PowerDetailExample example);

    int updateByExample(@Param("record") PowerDetail record, @Param("example") PowerDetailExample example);

    int updateByPrimaryKeySelective(PowerDetail record);

    int updateByPrimaryKey(PowerDetail record);
}