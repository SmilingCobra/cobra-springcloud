package com.lw.controller;

import com.lw.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nacos")
public class NacosController {
@Autowired
    private PayService payService;

    @RequestMapping("/payment/getPayment/{id}")
    public String getPayment(@PathVariable("id") String id){
    return "nacos client------>"+payService.getPayment(id);
    }
}
