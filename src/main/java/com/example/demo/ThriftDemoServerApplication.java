package com.example.demo;

import com.example.demo.component.ThriftServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ThriftDemoServerApplication {

    public static void main(String[] args) {
        final ApplicationContext applicationContext = SpringApplication.run(ThriftDemoServerApplication.class, args);
        ThriftServer thriftServer = (ThriftServer) applicationContext.getBean(ThriftServer.class);
        thriftServer.startServer();
    }

}
