package com.xmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class XmallRegistry {
    public static void main(String[] args) {
        SpringApplication.run(XmallRegistry.class,args);
    }
}
