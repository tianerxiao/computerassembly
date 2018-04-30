package group.computerAssembly.dao;

import group.computerAssembly.entity.BoardDetail;
import group.computerAssembly.entity.BoardDetailExample;
import java.util.List;

public interface BoardDetailMapper {
    int deleteByPrimaryKey(Integer boarddId);

    int insert(BoardDetail record);

    int insertSelective(BoardDetail record);

    List<BoardDetail> selectByExample(BoardDetailExample example);

    BoardDetail selectByPrimaryKey(Integer boarddId);

    int updateByPrimaryKeySelective(BoardDetail record);

    int updateByPrimaryKey(BoardDetail record);
}