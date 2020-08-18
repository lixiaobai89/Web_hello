package com.lishan.ssm.utils.designPatterns.factoryPattern;

public class Client {
    public static void main(String[] args) {
        IFactory factory = new Factory();
        IProduct product = factory.createProduct();
        product.productMethod();
    }
}
