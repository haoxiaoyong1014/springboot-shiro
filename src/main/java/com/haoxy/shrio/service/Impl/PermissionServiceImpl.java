package com.haoxy.shrio.service.Impl;

import com.haoxy.shrio.mapper.PermissionMapper;
import com.haoxy.shrio.model.SysPermission;
import com.haoxy.shrio.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by haoxy on 2018/8/7.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
@Service
@Transactional
public class PermissionServiceImpl implements PermissionService{

    @Autowired
    private PermissionMapper permissionMapper;

}
