package com.kts.java_practice.InfPractice.Overriding;

public class Computer extends Calculator{

    @Override
    double areaCircle(double r){
        return Math.PI *r *r;   // 정확한 계산 재정의
    }
}