package com.lishan.ssm.action;

import java.util.Random;

public class ArrivalTimesTester {
    static final Random RANDOM = new Random();
    static final double LAMBDA = 0.25;

    static double time() {
        double p = RANDOM.nextDouble();
        return -Math.log(1 - p) / LAMBDA;
    }

    public static void main(String[] args){
        double time;
        double sum=0;
        for (int i=0; i<8; i++){
            time = time();
            System.out.println(time);
            sum+=time;
        }
        System.out.println("avg= "+sum/8);
    }
}
