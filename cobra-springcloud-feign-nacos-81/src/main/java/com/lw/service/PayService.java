package com.lw.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("nacos-payment-provider")
public interface PayService {
        //   /payment/getPayment/{id}
    @RequestMapping("/payment/getPayment/{id}")
     String getPayment(@PathVariable("id") String id);



}
