package com.lishan.ssm.utils.responsibilityChain;


public interface Handler {
    public abstract void handleRequest(int number);   //具体处理用户请求60钻石抽一次还是270钻石抽五次
    public abstract void setNextHandler(Handler handler);

}

