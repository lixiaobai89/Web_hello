package com.lishan.ssm.utils.designPatterns.strategy;

public class Client {
    public static void main(String[] args){
        Context context;
        System.out.println("-----执⾏策略 1-----");
        context = new Context(new ConcreteStrategy1());
        context.execute();
        System.out.println("-----执⾏策略 2-----");
        context = new Context(new ConcreteStrategy2());
        context.execute();
    }
}