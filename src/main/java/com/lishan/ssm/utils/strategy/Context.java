package com.lishan.ssm.utils.strategy;

class Context {
    private IStrategy strategy;
    public Context(IStrategy strategy){
        this.strategy = strategy;
    }
    public void execute(){
        strategy.doSomething();
    }
}

