package group.computerAssembly.dao;

import group.computerAssembly.entity.Fornum;
import group.computerAssembly.entity.FornumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FornumMapper {
    int deleteByExample(FornumExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Fornum record);

    int insertSelective(Fornum record);

    List<Fornum> selectByExample(FornumExample example);

    Fornum selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Fornum record, @Param("example") FornumExample example);

    int updateByExample(@Param("record") Fornum record, @Param("example") FornumExample example);

    int updateByPrimaryKeySelective(Fornum record);

    int updateByPrimaryKey(Fornum record);
}