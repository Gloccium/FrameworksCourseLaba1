package com.example.demo.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class CacheService {

    @Cacheable("squareCache")
    public int square(int number) {
        System.out.println("Calculating square of " + number);
        return number * number;
    }
}