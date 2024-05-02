package com.kts.java_practice.inheritance.fieldPolymorphism;

public class Car {
    // 필드
    Tire frontLeftTire = new Tire("앞 왼", 6);
    Tire frontRightTire = new Tire("앞 오", 2);
    Tire backLeftTire = new Tire("뒤 왼", 3);
    Tire backRightTire = new Tire ("뒤 오", 4);

    int run() {
        System.out.println("[자동차가 달립니다.]");
        if(frontLeftTire.roll()==false){stop(); return 1;}
        if(frontRightTire.roll()==false){stop(); return 2;}
        if(backLeftTire.roll()==false){stop(); return 3;}
        if(backRightTire.roll()==false){stop(); return 4;}
        return 0;
    }

    void stop(){
        System.out.println("[자동차가 멈춥니다.]");
    }
}
