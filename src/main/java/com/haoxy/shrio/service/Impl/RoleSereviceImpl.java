package com.haoxy.shrio.service.Impl;

import com.haoxy.shrio.mapper.RoleMapper;
import com.haoxy.shrio.model.RoleExample;
import com.haoxy.shrio.model.SysRole;
import com.haoxy.shrio.service.RoleService;
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
public class RoleSereviceImpl implements RoleService{
    @Autowired
    private RoleMapper roleMapper;

}
