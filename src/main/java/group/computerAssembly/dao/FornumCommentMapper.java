package group.computerAssembly.dao;

import group.computerAssembly.entity.FornumComment;
import group.computerAssembly.entity.FornumCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FornumCommentMapper {
    int deleteByExample(FornumCommentExample example);

    int deleteByPrimaryKey(String commentId);

    int insert(FornumComment record);

    int insertSelective(FornumComment record);

    List<FornumComment> selectByExample(FornumCommentExample example);

    FornumComment selectByPrimaryKey(String commentId);

    int updateByExampleSelective(@Param("record") FornumComment record, @Param("example") FornumCommentExample example);

    int updateByExample(@Param("record") FornumComment record, @Param("example") FornumCommentExample example);

    int updateByPrimaryKeySelective(FornumComment record);

    int updateByPrimaryKey(FornumComment record);
}