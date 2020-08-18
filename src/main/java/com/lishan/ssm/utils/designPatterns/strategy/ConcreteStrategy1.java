package com.lishan.ssm.utils.designPatterns.strategy;

public class ConcreteStrategy1 implements IStrategy{
    @Override
    public void doSomething() {
        System.out.println("具体策略1");
    }
}

