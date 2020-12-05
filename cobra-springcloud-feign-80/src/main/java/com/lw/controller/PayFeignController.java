package com.lw.controller;

import com.lw.service.PayFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class PayFeignController {
    @Autowired
    private PayFeignService payFeignService;

    @RequestMapping("/hello")
    public String hello(){
        return "feign---->"+payFeignService.hello();
    }
}
