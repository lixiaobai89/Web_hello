package com.lishan.ssm.utils.designPatterns.factoryPattern;

public class Factory implements IFactory {

    @Override
    public IProduct createProduct() {
        return new Product();
    }
}
