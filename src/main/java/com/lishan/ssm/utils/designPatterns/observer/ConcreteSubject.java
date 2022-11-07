package com.lishan.ssm.utils.designPatterns.observer;

public class ConcreteSubject extends Subject {
    //具体业务
    public void doSomething(){
        System.out.println("被观察者事件发生");
        this.notifyObserver();
    }
}