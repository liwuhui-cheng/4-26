package com.lixuecheng.rikao.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CenterConfig {

    //注册中心提供者
    public static void main(String[] args) {


        SpringApplication.run(CenterConfig.class,args);

    }

}
