package com.lw.controller;

import com.lw.service.IPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired()
    @Qualifier("IPayServiceImpl")
    private IPayService iPayService;

@RequestMapping("/hello")
    public String hello(){
        return iPayService.hello();
    }
}
