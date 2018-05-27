package group.computerAssembly.dao;

import group.computerAssembly.entity.IpAccess;
import group.computerAssembly.entity.IpAccessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IpAccessMapper {
    int deleteByExample(IpAccessExample example);

    int deleteByPrimaryKey(String ip);

    int insert(IpAccess record);

    int insertSelective(IpAccess record);

    List<IpAccess> selectByExample(IpAccessExample example);

    IpAccess selectByPrimaryKey(String ip);

    int updateByExampleSelective(@Param("record") IpAccess record, @Param("example") IpAccessExample example);

    int updateByExample(@Param("record") IpAccess record, @Param("example") IpAccessExample example);

    int updateByPrimaryKeySelective(IpAccess record);

    int updateByPrimaryKey(IpAccess record);
}