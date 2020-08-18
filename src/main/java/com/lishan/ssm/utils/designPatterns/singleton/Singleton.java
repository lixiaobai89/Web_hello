package com.lishan.ssm.utils.designPatterns.singleton;

public class Singleton {
    private static Singleton instance ;
    private Singleton (){}
    //使用synchronized修饰不会产生线程安全问题
    //没有使用synchronized修饰会产生线程安全问题
    public /*synchronized*/ static Singleton getInstance() {
        //判空能起到防止多次new实例对象而产生垃圾内存
        if(instance == null){
            Singleton instance_temp = new Singleton();
            System.out.println("instance为null时new的对象"+instance_temp);
            instance = instance_temp;
        }
        return instance;
    }
}
