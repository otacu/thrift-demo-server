package com.example.demo.service.impl;

import com.example.demo.service.HelloWorldService;
import org.apache.thrift.TException;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements HelloWorldService.Iface {
    @Override
    public String sayHello(String username) throws TException {
        return username + " say hello";
    }
}
