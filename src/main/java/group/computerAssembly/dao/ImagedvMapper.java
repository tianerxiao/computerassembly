package group.computerAssembly.dao;

import group.computerAssembly.entity.Imagedv;
import group.computerAssembly.entity.ImagedvExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImagedvMapper {
    int deleteByExample(ImagedvExample example);

    int deleteByPrimaryKey(String filename);

    int insert(Imagedv record);

    int insertSelective(Imagedv record);

    List<Imagedv> selectByExample(ImagedvExample example);

    Imagedv selectByPrimaryKey(String filename);

    int updateByExampleSelective(@Param("record") Imagedv record, @Param("example") ImagedvExample example);

    int updateByExample(@Param("record") Imagedv record, @Param("example") ImagedvExample example);

    int updateByPrimaryKeySelective(Imagedv record);

    int updateByPrimaryKey(Imagedv record);
}