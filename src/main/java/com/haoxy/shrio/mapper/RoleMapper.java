package com.haoxy.shrio.mapper;

import com.haoxy.shrio.model.RoleExample;
import java.util.List;

import com.haoxy.shrio.model.SysRole;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleMapper {
    long countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    List<SysRole> selectByExample(RoleExample example);

    SysRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysRole record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") SysRole record, @Param("example") RoleExample example);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);


}