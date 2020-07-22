package com.lishan.ssm.action;

public class Test3 {
    public static long solve(int n){

        if(n <= 2){
            return n;
        }
        int f1 = 0;
        int f2 = 1;
        int sum = 0;
        for(int i=1; i <= n ; i++){
            sum = f1 + f2;
            f1 = f2;
            f2 = sum;
        }

        return sum;

    }

    public static long solve2(int n){
        if(n<=2) {
            return n;
        }else {
            System.out.println(n);
            return solve2(n -1)+solve2(n-2);
        }

    }
    public static void main(String[] args) {
        long startTime;
        long endTime;
        startTime = Time();
        System.out.println(solve(10));
        endTime = Time();
        System.out.println(endTime - startTime);

        startTime = Time();
        System.out.println(solve2(10));
        endTime = Time();
        System.out.println(endTime - startTime);
    }

    public static long Time(){
        long time = System.currentTimeMillis();
        return time;
    }

}
