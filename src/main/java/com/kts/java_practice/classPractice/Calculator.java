package com.kts.java_practice.classPractice;

// 메서드 내부 호출 예시
public class Calculator {
    int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    double avg(int x, int y) {
        double sum = plus(x, y); // plus 호출
        double result = sum / 2;
        return result;
    }

    String color;            // 색깔은 바뀔수 있어서 인스턴스 필드
    static double pi = 3.14; // pi는 항상 일정하므로 정적 필드

    public void test(){
    //    color = Calculator.color; // 인스턴스 필드 이므로 오류
        pi = Calculator.pi;       // 정적 필드 이므로 사용 가능
    }
}
