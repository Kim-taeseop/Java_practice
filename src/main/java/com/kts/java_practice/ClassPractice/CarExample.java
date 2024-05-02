package com.kts.java_practice.ClassPractice;

// 클래스
public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car ("검정", 3000);
        myCar.color = "white";
        System.out.println(myCar.color);

        // 오버로딩 실습
        Car car1 = new Car();
        System.out.println("회사 : " + car1.company);
        System.out.println();

        Car car2 = new Car("자가용");
        System.out.println("회사 : " + car2.company);
        System.out.println("모델 : " + car2.model);
        System.out.println();

        Car car3 = new Car("자가용", "검정");
        System.out.println("회사 : " + car3.company);
        System.out.println("모델 : " + car3.model);
        System.out.println("색상 : " + car3.color);
        System.out.println();

        Car car4 = new Car("택시", "흰색", 1000);
        System.out.println("회사 : " + car4.company);
        System.out.println("모델 : " + car4.model);
        System.out.println("색상 : " + car4.color);
        System.out.println("cc : " + car4.cc);
    }
}
