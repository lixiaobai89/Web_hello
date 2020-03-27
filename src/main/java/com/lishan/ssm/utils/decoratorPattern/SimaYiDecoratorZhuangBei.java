package com.lishan.ssm.utils.decoratorPattern;

public class SimaYiDecoratorZhuangBei extends Decorator{

    SimaYiDecoratorZhuangBei(Hero hero){
        super(hero);
    }

    public double attribute1(){
        double abilityPower=0;
        abilityPower=hero.attribute1()+eleAttribute1();
        //委托被装饰者hero调用attribute1()，然后再调用eleattribute1()
        return abilityPower;
    }
    public double attribute2(){
        double movementSpeed=0;
        movementSpeed=hero.attribute2()+eleAttribute2();
        //委托被装饰者hero调用attribute2()，然后再调用eleattribute2()
        movementSpeed = (double)(Math.round(movementSpeed*10)/10.0);   //“四舍五入”保留小数点后1位
        return movementSpeed;
    }
    public double attribute3(){
        double attackSpeed=0;
        attackSpeed=eleAttribute3();
        return attackSpeed;
    }
    public double attribute4(){
        double attackPower=0;
        attackPower=hero.attribute4()+eleAttribute4();
        //委托被装饰者hero调用attribute4()，然后再调用eleattribute4()
        return attackPower;
    }

    public double eleAttribute1(){             //装饰者新添加的方法
        double AbilityPower=52;
        double wushufazhangAbilityPower=140;   //巫术法杖使得英雄法术攻击加成140点伤害
        double shishenzhishuAbilityPower=180;   //噬神之书使得英雄法术攻击加成180点伤害
        double boxuezhezhinuAbilityPower=240;   //博学者之怒使得英雄法术攻击加成240点伤害
        double xuwufazhangAbilityPower=240;   //博学者之怒使得英雄法术攻击加成240点伤害
        AbilityPower= AbilityPower+wushufazhangAbilityPower+shishenzhishuAbilityPower+boxuezhezhinuAbilityPower+xuwufazhangAbilityPower;
        return AbilityPower;
    }
    public double eleAttribute2(){             //装饰者新添加的方法
        double MovementSpeed=587.68;
        double wushufazhangMovementSpeed=0.08;     //巫术法杖使得英雄移动速度加成8%
        MovementSpeed=MovementSpeed*(1+wushufazhangMovementSpeed);
        return MovementSpeed;
    }
    public double eleAttribute3(){             //装饰者新添加的方法
        double AttackSpeed=16;
        double jisuzhanxueAttackSpeed=0.3;     //极速战靴使得英雄攻击速度加成30%
        AttackSpeed=AttackSpeed*(1+jisuzhanxueAttackSpeed);
        return AttackSpeed;
    }
    public double eleAttribute4() {
        double AttackPower=179;
        double mingdaosimingAttackSpeed=1.0;     //名刀·司命使得英雄攻击速度加成1.0%
        AttackPower=AttackPower*(1+mingdaosimingAttackSpeed);
        return AttackPower;
    }

}
