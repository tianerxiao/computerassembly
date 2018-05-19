package group.computerAssembly.dao;

import group.computerAssembly.entity.BoardDetail;
import group.computerAssembly.entity.BoardDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BoardDetailMapper {
    int deleteByExample(BoardDetailExample example);

    int deleteByPrimaryKey(Integer boarddId);

    int insert(BoardDetail record);

    int insertSelective(BoardDetail record);

    List<BoardDetail> selectByExample(BoardDetailExample example);

    BoardDetail selectByPrimaryKey(Integer boarddId);

    int updateByExampleSelective(@Param("record") BoardDetail record, @Param("example") BoardDetailExample example);

    int updateByExample(@Param("record") BoardDetail record, @Param("example") BoardDetailExample example);

    int updateByPrimaryKeySelective(BoardDetail record);

    int updateByPrimaryKey(BoardDetail record);
}