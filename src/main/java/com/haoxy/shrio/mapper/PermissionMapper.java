package com.haoxy.shrio.mapper;

import com.haoxy.shrio.model.PermissionExample;
import java.util.List;

import com.haoxy.shrio.model.SysPermission;
import org.apache.ibatis.annotations.Param;

public interface PermissionMapper {

    long countByExample(PermissionExample example);

    int deleteByExample(PermissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysPermission record);

    int insertSelective(SysPermission record);

    List<SysPermission> selectByExample(PermissionExample example);

    SysPermission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysPermission record, @Param("example") PermissionExample example);

    int updateByExample(@Param("record") SysPermission record, @Param("example") PermissionExample example);

    int updateByPrimaryKeySelective(SysPermission record);

    int updateByPrimaryKey(SysPermission record);
}