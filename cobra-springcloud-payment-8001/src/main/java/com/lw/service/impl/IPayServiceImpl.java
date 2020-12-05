package com.lw.service.impl;

import com.lw.service.IPayService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("IPayServiceImpl")
public class IPayServiceImpl implements IPayService {
    @Value("${server.port}")
    private int port;

    @Override
    public String hello() {
        return "hello world from "+port;
    }
}
