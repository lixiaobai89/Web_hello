package com.lishan.ssm.utils.designPatterns.singleton;

public class Client extends Thread{
    @Override
    public void run() {
        System.out.println(Singleton.getInstance());
    }

    public static void main(String[] args) {
        Client[] thread = new Client[10000];
        for(int i=0; i<10000; i++){
            thread[i] = new Client();
        }
        for(int i=0; i<10000; i++){
            thread[i].setName(i+"线程");
            thread[i].start();
        }
        System.out.println("4444444444444");

    }
}
