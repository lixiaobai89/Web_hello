package com.lishan.ssm.utils.decoratorPattern;

public class Application {
    public void needSimayiPifu(Hero hero){
        double SimayiAttribute1=hero.attribute1();
        System.out.println("");
        System.out.println("英雄司马懿换上“魇语军师”皮肤后的状态属性：");
        System.out.println("法术伤害: "+SimayiAttribute1);
        System.out.println("物理伤害：179.0");
        System.out.println("移动速度：370.0");
        System.out.println("攻速加成：0.0%");
        System.out.println("--------------------------------------------------");
    }

    public void needSimayiMingwen(Hero hero){
        double SimayiAttribute1=hero.attribute1();
        double SimayiAttribute2=hero.attribute2();
        double SimayiAttribute3=hero.attribute3();
        System.out.println("");
        System.out.println("英雄司马懿在拥有皮肤的基础上再装配150级铭文后的状态属性：");
        System.out.println("法术伤害: "+SimayiAttribute1);
        System.out.println("物理伤害：179.0");
        System.out.println("移动速度："+SimayiAttribute2);
        System.out.println("攻速加成："+SimayiAttribute3+"%");
        System.out.println("--------------------------------------------------");
    }
    public void needSimayiZhuangbei(Hero hero){
        double SimayiAttribute1=hero.attribute1();
        double SimayiAttribute2=hero.attribute2();
        double SimayiAttribute3=hero.attribute3();
        double SimayiAttribute4=hero.attribute4();
        System.out.println("");
        System.out.println("英雄司马懿在拥有皮肤和150级铭文的基础上再装备6神装后的状态属性：");
        System.out.println("法术伤害: "+SimayiAttribute1);
        System.out.println("物理伤害："+SimayiAttribute4);
        System.out.println("移动速度："+SimayiAttribute2);
        System.out.println("攻速加成："+SimayiAttribute3+"%");
    }

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("英雄司马懿初始状态属性：");
        System.out.println("法术伤害：0.0");
        System.out.println("物理伤害：179.0");
        System.out.println("移动速度：370.0");
        System.out.println("攻速加成：0.0%");
        System.out.println("---------------------------------------------------");
        Application client=new Application();
        Hero simayi=new SimaYi();                 //司马懿初始状态属性
        Hero simayiDecorator1=new SimaYiDecorator(simayi);     //换上“魇语军师”皮肤后的状态属性
        client.needSimayiPifu(simayiDecorator1);
        Hero simayiDecorator2=new SimaYiDecoratorMingWen(simayi);     //150级铭文后的状态属性
        client.needSimayiMingwen(simayiDecorator2);
        Hero simayiDecorator3=new SimaYiDecoratorZhuangBei(simayi);     //6神装后的状态属性
        client.needSimayiZhuangbei(simayiDecorator3);

    }

}
