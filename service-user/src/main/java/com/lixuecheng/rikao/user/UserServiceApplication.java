package com.lixuecheng.rikao.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class UserServiceApplication {

    //用户启动类，配置相关    EnableConfigServer注解
    public static void main(String[] args) {

        SpringApplication.run(UserServiceApplication.class,args);

    }

}
