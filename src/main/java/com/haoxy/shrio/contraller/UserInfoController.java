package com.haoxy.shrio.contraller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by haoxy on 2018/8/6.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
@RestController
@RequestMapping("/userInfo")
public class UserInfoController {
    /**
     * 用户查询.
     *
     * @return
     */
    @RequestMapping("/userList")
    @RequiresPermissions("userInfo:view")//权限管理;
    public ModelAndView userInfo() {
        ModelAndView modelAndView = new ModelAndView("userInfo");
        return modelAndView;
    }

    /**
     * 用户添加;
     *
     * @return
     */
    @RequestMapping("/userAdd")
    @RequiresPermissions("userInfo:add")//权限管理;
    public ModelAndView userInfoAdd() {
        ModelAndView modelAndView = new ModelAndView("userInfoAdd");
        return modelAndView;
    }

    /**
     * 用户删除;
     *
     * @return
     */
    @RequestMapping("/userDel")
    @RequiresPermissions("userInfo:del")//权限管理;
    public ModelAndView userDel() {
        ModelAndView modelAndView = new ModelAndView("userInfoDel");
        return modelAndView;
    }

}
