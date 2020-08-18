package com.lishan.ssm.utils.designPatterns.decoratorPattern;

public abstract class Decorator extends Hero{
    protected Hero hero;
    public Decorator(){

    }
    public Decorator(Hero hero){
        this.hero=hero;
    }

}
