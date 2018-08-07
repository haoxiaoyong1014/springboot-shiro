package com.haoxy.shrio.mapper;

import com.haoxy.shrio.model.SysPermission;
import com.haoxy.shrio.model.SysRole;
import com.haoxy.shrio.model.UserExample;
import com.haoxy.shrio.model.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * Created by haoxy on 2018/8/6.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
@Repository
public interface UserInfoMapper {
    /**通过username查找用户信息;*/
     UserInfo findByUsername(String username);

    List<SysRole> findSysRoleByUsername(String username);

    List<SysPermission> findSysPermissionByUid(Integer uid);

    /*long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    List<UserInfo> selectByExample(UserExample example);

    UserInfo selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserExample example);

    int updateByExample(@Param("record") UserInfo record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);*/
}
