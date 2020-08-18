package com.lishan.ssm.utils.designPatterns.decoratorPattern;

public class SimaYiDecorator extends Decorator{

    public final double PiFuAddAbilityPower=10;  //换上“魇语军师”皮肤后的法术攻击+10点伤害

    SimaYiDecorator(Hero hero){
        super(hero);
    }

    public double attribute1(){
        double abilityPower=0;
        abilityPower=hero.attribute1()+eleAttribute1();
        //委托被装饰者hero调用attribute1()，然后再调用eleattribute1()
        return abilityPower;
    }

    public double eleAttribute1(){             //装饰者新添加的方法eleAttribute1()
        return PiFuAddAbilityPower;
    }

    @Override
    public double attribute2() {
        // TODO 自动生成的方法存根
        return 0;
    }

    @Override
    public double attribute3() {
        // TODO 自动生成的方法存根
        return 0;
    }

    @Override
    public double attribute4() {
        // TODO 自动生成的方法存根
        return 0;
    }
}
