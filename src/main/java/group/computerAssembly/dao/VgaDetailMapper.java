package group.computerAssembly.dao;

import group.computerAssembly.entity.VgaDetail;
import group.computerAssembly.entity.VgaDetailExample;
import java.util.List;

public interface VgaDetailMapper {
    int deleteByPrimaryKey(Integer vgadId);

    int insert(VgaDetail record);

    int insertSelective(VgaDetail record);

    List<VgaDetail> selectByExample(VgaDetailExample example);

    VgaDetail selectByPrimaryKey(Integer vgadId);

    int updateByPrimaryKeySelective(VgaDetail record);

    int updateByPrimaryKey(VgaDetail record);
}