package com.lishan.ssm.utils.decoratorPattern;

public class SimaYiDecoratorMingWen extends Decorator{
    SimaYiDecoratorMingWen(Hero hero){
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
        double AttackSpeed=0;
        AttackSpeed=eleAttribute3();
        return AttackSpeed;
    }

    public double eleAttribute1(){             //装饰者新添加的方法eleAttribute1()
        double AbilityPower=10;
        double mengyanAbilityPower=4.2;   //1个5级铭文梦魇使得英雄法术攻击加成4.2点伤害
        AbilityPower+=mengyanAbilityPower*10;   //10个5级铭文梦魇的法术攻击加成
        return AbilityPower;
    }
    public double eleAttribute2(){             //装饰者新添加的方法eleAttribute2()
        double MovementSpeed=370;
        double shoulieMovementSpeed=0.01;     //1个5级铭文狩猎使得英雄移动速度加成1.0%
        int i;
        for(i=1;i<=10;i++){
            MovementSpeed=MovementSpeed*(1+shoulieMovementSpeed);    //累加得加成后的移速
        }
        //10个5级铭文狩猎的移速加成
        return  MovementSpeed;
    }
    public double eleAttribute3(){             //装饰者新添加的方法eleAttribute3()
        double xinyanAttackSpeed=0.6;     //1个5级铭文心眼使得英雄攻击速度加成0.6%
        double shoulieAttackSpeed=1.0;     //1个5级铭文狩猎使得英雄攻击速度加成1.0%
        double AttackSpeed=(xinyanAttackSpeed+shoulieAttackSpeed)*10;    //10个5级铭文心眼和10个5级铭文狩猎的攻速加成
        return AttackSpeed;
    }

    @Override
    public double attribute4() {
        // TODO 自动生成的方法存根
        return 0;
    }
}
