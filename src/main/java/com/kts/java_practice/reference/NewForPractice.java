package com.kts.java_practice.reference;

public class NewForPractice {
    public static void main(String[] args) {
        int[] tests = {1,2,3};

        int sum = 0;
        for(int test : tests){
            sum = sum + test;
        }
        System.out.println("합계 : " + sum);
    }
}
