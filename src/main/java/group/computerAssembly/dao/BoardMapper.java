package group.computerAssembly.dao;

import group.computerAssembly.entity.Board;
import group.computerAssembly.entity.BoardExample;
import java.util.List;

public interface BoardMapper {
    int deleteByPrimaryKey(Integer boardId);

    int insert(Board record);

    int insertSelective(Board record);

    List<Board> selectByExampleWithBLOBs(BoardExample example);

    List<Board> selectByExample(BoardExample example);

    Board selectByPrimaryKey(Integer boardId);

    int updateByPrimaryKeySelective(Board record);

    int updateByPrimaryKeyWithBLOBs(Board record);

    int updateByPrimaryKey(Board record);
}