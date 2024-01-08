package com.kts.java_practice.conditional;

public class continuePractice {
    public static void main(String[] args) {
        for(int i = 0; i<=10; i++){
            if(i%2 !=0) {  // i의 나머지가 0이 아닐 경우
                continue;  // 증감식으로 이동
            }
            System.out.print(i + ", "); // 결과 : 0, 2, 4, 6, 8, 10,
        }
    }
}
