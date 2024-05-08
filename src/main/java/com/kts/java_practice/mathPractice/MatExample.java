package com.kts.java_practice.mathPractice;

public class MatExample {
    public static void main(String[] args){
        // 절대값
        int v1 = Math.abs(-5);
        double v2 = Math.abs(-3.14);
        System.out.println("-5의 절대값 : " + v1);
        System.out.println("-3.14의 절대값 : " + v2);

        // 올림값
        double v3 = Math.ceil(5.3);
        double v4 = Math.ceil(-5.3);
        System.out.println("5.3의 올림값 : "+ v3);
        System.out.println("-5.3의 올림값 : "+ v4);

        // 버림값
        double v5 = Math.floor(5.3);
        double v6 = Math.floor(-5.3);
        System.out.println("5.3의 버림값 : "+ v5);
        System.out.println("-5.3의 버림값 : "+ v6);

        // 최대값, 최소값
        int v7 = Math.max(2,5);
        double v8 = Math.max(5.3, 2.4);
        double v9 = Math.min(5.3, 2.4);
        System.out.println("2,5의 최대값 : "+ v7);
        System.out.println("5.3, 2.4의 최대값 : "+ v8);
        System.out.println("5.3, 2.4의 최소값 : "+ v9);

        // 랜덤값
        double v10 = Math.random();
        int v11 = (int) (Math.random()*6) + 1 ; // 주사위 랜덤
        System.out.println("0~1 랜덤값 : "+ v10);
        System.out.println("주사위 굴리기 : "+ v11);

        // 가까운 정수의 실수값
        double v12 = Math.rint(5.3);
        double v13 = Math.rint(5.7);
        System.out.println("5.3의 가까운 정수 : "+ v12);
        System.out.println("5.7의 가까운 정수 : "+ v13);

        // 반올림값
        long v14 = Math.round(5.3);
        long v15 = Math.round(5.7);
        System.out.println("5.3의 반올림 : "+ v14);
        System.out.println("5.7의 반올림 : "+ v15);

        // 소수 3번째 자리에서 반올림
        double value = 12.3456;
        double temp1 = value * 100;
        long temp2 = Math.round(temp1);
        double v16 = temp2 / 100.0;
        System.out.println("12.3456의 소수셋째 자리에서 반올림 : " + v16);
    }
}
