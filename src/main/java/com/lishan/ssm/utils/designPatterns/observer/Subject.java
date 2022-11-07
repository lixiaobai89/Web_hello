package com.lishan.ssm.utils.designPatterns.observer;

import java.util.Vector;

abstract class Subject {
    //观察者列表
    private Vector obs = new Vector();
    //增加一个观察者
    public void addObserver(Observer obs){
        this.obs.add(obs);
    }
    //删除一个观察者
    public void removeObserver(Observer obs){
        this.obs.remove(obs);
    }
    //通知所有观察者
    protected void notifyObserver(){
        for(Object o: obs){
            Observer observer = (Observer)o;
            observer.exe();
        }
    }
    public abstract void doSomething();
}










