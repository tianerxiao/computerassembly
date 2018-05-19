package group.computerAssembly.dao;

import group.computerAssembly.entity.VgaDetail;
import group.computerAssembly.entity.VgaDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VgaDetailMapper {
    int deleteByExample(VgaDetailExample example);

    int deleteByPrimaryKey(Integer vgadId);

    int insert(VgaDetail record);

    int insertSelective(VgaDetail record);

    List<VgaDetail> selectByExample(VgaDetailExample example);

    VgaDetail selectByPrimaryKey(Integer vgadId);

    int updateByExampleSelective(@Param("record") VgaDetail record, @Param("example") VgaDetailExample example);

    int updateByExample(@Param("record") VgaDetail record, @Param("example") VgaDetailExample example);

    int updateByPrimaryKeySelective(VgaDetail record);

    int updateByPrimaryKey(VgaDetail record);
}