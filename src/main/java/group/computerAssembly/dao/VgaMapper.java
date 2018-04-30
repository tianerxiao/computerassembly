package group.computerAssembly.dao;

import group.computerAssembly.entity.Vga;
import group.computerAssembly.entity.VgaExample;
import java.util.List;

public interface VgaMapper {
    int deleteByPrimaryKey(Integer vgaId);

    int insert(Vga record);

    int insertSelective(Vga record);

    List<Vga> selectByExampleWithBLOBs(VgaExample example);

    List<Vga> selectByExample(VgaExample example);

    Vga selectByPrimaryKey(Integer vgaId);

    int updateByPrimaryKeySelective(Vga record);

    int updateByPrimaryKeyWithBLOBs(Vga record);

    int updateByPrimaryKey(Vga record);
}