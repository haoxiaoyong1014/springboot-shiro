# springboot-shiro
springboot集成 shiro做权限管理

登录账号: admin

登录密码: 123456

sql文件在根目录下

在 application.yml 文件中改写成自己的数据库 

**测试:**

编写好后就可以启动程序，访问http://localhost:2335/userInfo/userList页面，由于没有登录就会跳转到http://localhost:2335/login页面。登录之后就会跳转到index页面，登录后，直接在浏览器中输入http://localhost:2335/userInfo/userList访问就会看到用户信息。上面这些操作时候触发MyShiroRealm.doGetAuthenticationInfo()这个方法，也就是登录认证的方法。

登录admin账户，访问：http://127.0.0.1:2335/userInfo/userAdd显示用户添加界面，访问http://127.0.0.1:2335/userInfo/userDel显示403没有权限。上面这些操作时候触发MyShiroRealm.doGetAuthorizationInfo()这个方面，也就是权限校验的方法。

前端页面很简单,主要是演示功能,演示的这些功能只是 shiro的冰山一角, 

**更多功能详见:**

springboot-shiro-v1.2.0(<a href="https://github.com/haoxiaoyong1014/springboot-shiro-v1.2.0">加强版<a>)

**支持功能:** 

* 认证

* 授权

* rememberMe(记住我)

* 密码输错次数过多,暂停使用该账户

* 统一异常处理
