package com.lishan.ssm.utils.designPatterns.other;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest {

    public void print(){

        ExecutorService es1 = Executors.newSingleThreadExecutor();

        final Map<String, Object> map;
        map = new HashMap<String, Object>();
        map.put("a", 3);

        String s="aaa";
        es1.execute(new Runnable(){

            @Override
            public void run() {
                Map map1=new Test().print(map);
                System.out.println(map1);
            }
        });
        es1.shutdown();

    }
    public void printStr(){

        ExecutorService es1 = Executors.newSingleThreadExecutor();

        final Map<String, Object> map;
        map = new HashMap<String, Object>();
        map.put("a", 3);

        final String s="aaa";
        es1.execute(new Runnable(){

            @Override
            public void run() {
                String b=new Test().printStr(s);
                System.out.println("b= "+b);
            }
        });
        es1.shutdown();

    }

    public static void main(String[] args) {

        new ThreadTest().printStr();
    }
}
