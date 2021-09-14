package com.xmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class XmallItemApplication {
    public static void main(String[] args) {
        SpringApplication.run(XmallItemApplication.class);
    }
}
