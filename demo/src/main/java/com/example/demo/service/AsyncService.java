package com.example.demo.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncService {

    @Async
    public void longRunningTask() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Async task completed in " + Thread.currentThread().getName());
    }
}