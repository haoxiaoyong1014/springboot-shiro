package com.haoxy.shrio.service;

import com.haoxy.shrio.model.UserInfo;

/**
 * Created by haoxy on 2018/8/6.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
public interface UserInfoService {

   UserInfo findByUsername(String username);
}
