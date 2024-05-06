package com.kts.java_practice.classPractice;

public class Car {
    // 필드에서 객체 초기화
    String company = "현대";
    String model;
    String color;
    int cc;

    // 생성자에서 객체 초기화
    public Car(String color, int cc){
        this.color = color;
        this.cc = cc;
    }
    //  color = color; 로 하면 필드와 매개변수 명이 동일하기 때문에 접근 불가
    // => 동일한 이름의 매개 변수가 사용 우선순위가 높기 때문


    // 오버로딩. 여러개의 생성자 선언
    Car() {}

    Car(String model) {
        this.model = model;
    }

    Car(String model, String color){
        this.model = model;
        this.color = color;
    }

    Car(String model, String color, int cc){
        this.model = model;
        this.color = color;
        this.cc=cc;
    }
}
