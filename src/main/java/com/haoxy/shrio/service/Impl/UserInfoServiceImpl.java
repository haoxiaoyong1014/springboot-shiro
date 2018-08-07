package com.haoxy.shrio.service.Impl;

import com.haoxy.shrio.mapper.UserInfoMapper;
import com.haoxy.shrio.model.SysPermission;
import com.haoxy.shrio.model.SysRole;
import com.haoxy.shrio.model.UserInfo;
import com.haoxy.shrio.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by haoxy on 2018/8/6.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
@Service
@Transactional
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo findByUsername(String username) {
        return userInfoMapper.findByUsername(username);
    }
    @Override
    public List<SysRole> findSysRoleByUsername(String username) {

        return userInfoMapper.findSysRoleByUsername(username);
    }
    @Override
    public List<SysPermission> findSysPermissionByUid(Integer uid) {
        return userInfoMapper.findSysPermissionByUid(uid);
    }
}
