package com.lw.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/payment")
@RestController
public class PaymentController {
    @Value("${server.port}")
    private int serverPort;

    @RequestMapping("/getPayment/{id}")
    public String getPayment(@PathVariable("id") String id){
        return "Hello Nacos Discovery: " + serverPort + "\t id: " + id;
    }


}
