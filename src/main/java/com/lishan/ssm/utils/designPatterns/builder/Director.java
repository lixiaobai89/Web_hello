package com.lishan.ssm.utils.designPatterns.builder;

public class Director {
    private Builder builder = new ConcreteBuilder();
    public Product getAProduct(){
        builder.setPart("宝⻢汽⻋","X7");
        return builder.getProduct();
    }
    public Product getBProduct(){
        builder.setPart("奥迪汽⻋","Q5");
        return builder.getProduct();
    }
}
