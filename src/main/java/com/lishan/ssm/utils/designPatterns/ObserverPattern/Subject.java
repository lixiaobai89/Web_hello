package com.lishan.ssm.utils.designPatterns.ObserverPattern;

import java.util.Vector;

abstract class Subject {
    //观察者列表
    private Vector obs = new Vector();
    //增加一个观察者
    public void addObserver(Observer obs){
        this.obs.add(obs);
    }
    //删除一个观察者
    public void delObserver(Observer obs){
        this.obs.remove(obs);
    }
    //通知所有观察者
    protected void notifyObserver(){
        for(Object o: obs){
            Observer observer = (Observer)o;
            observer.update();
        }
    }
    public abstract void doSomething();
}
class ConcreteSubject extends Subject {
    //具体业务
    public void doSomething(){
        System.out.println("被观察者事件反⽣");
        this.notifyObserver();
    }
}
interface Observer {
    //更新
    public void update();
}
class ConcreteObserver1 implements Observer {
    public void update() {
        System.out.println("观察者1收到信息，并进⾏处理。");
    }
}
class ConcreteObserver2 implements Observer {
    public void update() {
        System.out.println("观察者2收到信息，并进⾏处理。");
    }
}
class Client {
    public static void main(String[] args){
        //创建一个主题
        Subject sub = new ConcreteSubject();
        //往主题中添加一个观察者
        sub.addObserver(new ConcreteObserver1()); //添加观察者1
        sub.addObserver(new ConcreteObserver2()); //添加观察者2
        //开始活动,该方法会对主题中的所有观察者
        sub.doSomething();
    }
}
