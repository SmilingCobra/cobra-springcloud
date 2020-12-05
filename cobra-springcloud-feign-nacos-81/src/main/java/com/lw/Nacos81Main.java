package com.lw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class Nacos81Main {
    //http://localhost:81/nacos/payment/getPayment/15
    public static void main(String[] args) {
        SpringApplication.run(Nacos81Main.class);
    }
}
