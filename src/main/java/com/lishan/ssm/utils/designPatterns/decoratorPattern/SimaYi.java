package com.lishan.ssm.utils.designPatterns.decoratorPattern;

public class SimaYi extends Hero{
    public final double AbilityPower=0;    //AP(法术伤害)
    public final double AttackPower=179;    //AD(物理伤害)
    public final double MovementSpeed=370;  //移速
    public final double AttackSpeed=0;    //攻速
    public double attribute1(){
        return AbilityPower;
    }
    public double attribute2(){
        return AttackPower;
    }
    public double attribute3(){
        return MovementSpeed;
    }
    public double attribute4(){
        return AttackSpeed;
    }

}