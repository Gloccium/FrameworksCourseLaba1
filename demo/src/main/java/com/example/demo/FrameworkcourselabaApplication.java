package com.example.demo;

import com.example.demo.config.AppConfig;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FrameworkcourselabaApplication implements CommandLineRunner {

    @Autowired private HelloService helloService;
    @Autowired private GreetingService greetingService;
    @Autowired private UserService userService;
    @Autowired private ProductService productService;
    @Autowired private OrderService orderService;
    @Autowired private AppConfig appConfig;
    @Autowired private QualifierDemo qualifierDemo;
    @Autowired private PaymentOrderService paymentOrderService;
    @Autowired private AppInfo appInfo;
    @Autowired private MethodInjectionDemo methodInjectionDemo;
    @Autowired private CacheService cacheService;
    @Autowired private AsyncService asyncService;

    public static void main(String[] args) {
        SpringApplication.run(FrameworkcourselabaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(helloService.sayHello());
        greetingService.greet();
        userService.showUser();
        productService.showProduct();
        orderService.printOrder();
        appConfig.databaseService().connect();
        qualifierDemo.show();
        paymentOrderService.processPayment();
        appInfo.printInfo();
        methodInjectionDemo.run();
        cacheService.square(4);   // Посчитает и закэширует
        cacheService.square(4);   // Возьмёт из кэша
        asyncService.longRunningTask();
    }
}