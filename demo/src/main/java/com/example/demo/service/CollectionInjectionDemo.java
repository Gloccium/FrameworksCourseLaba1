package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class CollectionInjectionDemo {

    @Autowired
    private List<Greeting> greetings;

    @Autowired
    private Map<String, Greeting> greetingMap;

    public void showCollections() {
        System.out.println("List contains: " + greetings.size() + " greetings");
        System.out.println("Map keys: " + greetingMap.keySet());
    }
}