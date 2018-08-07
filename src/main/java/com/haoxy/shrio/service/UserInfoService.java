package com.haoxy.shrio.service;

import com.haoxy.shrio.model.SysPermission;
import com.haoxy.shrio.model.SysRole;
import com.haoxy.shrio.model.UserInfo;

import java.util.List;

/**
 * Created by haoxy on 2018/8/6.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
public interface UserInfoService {

   List<SysRole> findSysRoleByUsername(String username);

   UserInfo findByUsername(String username);

   List<SysPermission> findSysPermissionByUid(Integer uid);
}
