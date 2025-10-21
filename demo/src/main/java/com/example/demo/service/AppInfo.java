package com.example.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppInfo {

    @Value("${app.name}")
    private String name;

    @Value("${app.version}")
    private String version;

    public void printInfo() {
        System.out.println("App: " + name + " (v" + version + ")");
    }
}