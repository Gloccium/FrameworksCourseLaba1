package com.example.demo.config;

import com.example.demo.service.HelloService;
import com.example.demo.service.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExtraConfig {

    @Bean
    public HelloService altHelloService() {
        return new HelloService();
    }

    @Bean
    public MessageService altMessageService() {
        return new MessageService();
    }
}