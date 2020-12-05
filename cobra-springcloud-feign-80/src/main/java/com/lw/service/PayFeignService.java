package com.lw.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient("CLOUD-PAYMENT-SERVICE")
public interface PayFeignService {
    @RequestMapping("/payment/hello")
    public String hello();

}
