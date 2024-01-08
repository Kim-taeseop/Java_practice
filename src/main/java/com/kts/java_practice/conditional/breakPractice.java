package com.kts.java_practice.conditional;

public class breakPractice {
    public static void main(String[] args) {
        while(true){
            int num = (int) (Math.random() * 6) +1; // 주사위 던지기
            System.out.println("주사위 눈 : "+num);
            if(num == 6){
                break;
            }
        }
        System.out.println("프로그램 종료");
    }
}
