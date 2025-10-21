package com.example.demo.config;

import com.example.demo.service.FactoryProduct;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class CustomFactory implements FactoryBean<FactoryProduct> {
    @Override
    public FactoryProduct getObject() {
        return new FactoryProduct("Created by FactoryBean");
    }

    @Override
    public Class<?> getObjectType() {
        return FactoryProduct.class;
    }
}