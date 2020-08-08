package com.lishan.ssm.utils.singleton;

public class Client extends Thread{
    @Override
    public void run() {
        System.out.println(Singleton.getInstance());
    }

    public static void main(String[] args) {
        Client[] thread = new Client[100];
        for(int i=0; i<10; i++){
            thread[i] = new Client();
        }
        for(int i=0; i<10; i++){
            thread[i].setName(i+"线程");
            thread[i].start();
        }

    }
}
