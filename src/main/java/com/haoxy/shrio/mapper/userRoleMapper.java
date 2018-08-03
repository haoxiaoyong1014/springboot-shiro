package com.haoxy.shrio.mapper;

import com.haoxy.shrio.model.userRole;
import com.haoxy.shrio.model.userRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface userRoleMapper {
    long countByExample(userRoleExample example);

    int deleteByExample(userRoleExample example);

    int insert(userRole record);

    int insertSelective(userRole record);

    List<userRole> selectByExample(userRoleExample example);

    int updateByExampleSelective(@Param("record") userRole record, @Param("example") userRoleExample example);

    int updateByExample(@Param("record") userRole record, @Param("example") userRoleExample example);
}