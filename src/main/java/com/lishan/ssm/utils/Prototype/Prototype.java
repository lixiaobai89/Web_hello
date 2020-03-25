package com.lishan.ssm.utils.Prototype;



import java.util.ArrayList;
/**
 * 仅基本数据类型复制
 */
//class Prototype implements Cloneable {
//    public Prototype clone(){
//        Prototype prototype = null;
//        try{
//            prototype = (Prototype)super.clone();
//        }catch(CloneNotSupportedException e){
//            e.printStackTrace();
//        }
//        return prototype;
//    }
//}

/**
 * 复杂数据类型复制
 */
public class Prototype implements Cloneable {
    private ArrayList list = new ArrayList();
    public Prototype clone(){
        Prototype prototype = null;
        try{
            prototype = (Prototype)super.clone();
            prototype.list = (ArrayList) this.list.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return prototype;
    }
}
class ConcretePrototype extends Prototype{
    public void show(){
        System.out.println("原型模式实现类");
    }
}


