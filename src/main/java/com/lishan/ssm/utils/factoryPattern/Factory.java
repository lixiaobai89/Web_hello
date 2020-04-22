package com.lishan.ssm.utils.factoryPattern;

public class Factory implements IFactory {

    @Override
    public IProduct createProduct() {
        return new Product();
    }
}
