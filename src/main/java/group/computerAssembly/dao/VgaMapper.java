package group.computerAssembly.dao;

import group.computerAssembly.entity.Vga;
import group.computerAssembly.entity.VgaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VgaMapper {
    int deleteByExample(VgaExample example);

    int deleteByPrimaryKey(Integer vgaId);

    int insert(Vga record);

    int insertSelective(Vga record);

    List<Vga> selectByExample(VgaExample example);

    Vga selectByPrimaryKey(Integer vgaId);

    int updateByExampleSelective(@Param("record") Vga record, @Param("example") VgaExample example);

    int updateByExample(@Param("record") Vga record, @Param("example") VgaExample example);

    int updateByPrimaryKeySelective(Vga record);

    int updateByPrimaryKey(Vga record);
}