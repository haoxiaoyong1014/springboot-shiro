package com.haoxy.shrio;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by haoxy on 2018/8/3.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
@SpringBootApplication(scanBasePackages = "com.haoxy.shrio")
@MapperScan("com.haoxy.shrio.mapper")
public class ShiroApp {
    public static void main(String[] args) {
        SpringApplication.run(ShiroApp.class,args);
    }
}
