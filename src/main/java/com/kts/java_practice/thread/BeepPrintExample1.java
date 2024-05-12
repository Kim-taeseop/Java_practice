package com.kts.java_practice.thread;

import java.awt.*;

// Thread 클래스로부터 직접 생성 예시
// 소리와 출력이 동시에 발생하지 않음
public class BeepPrintExample1 {
    public static void main(String[] args){
        Toolkit toolkit = Toolkit.getDefaultToolkit();  // Tookit 객체 얻기
        for(int i =0; i<5; i++){
            toolkit.beep(); // 비프음 발생
            try { Thread.sleep(500); } catch (Exception e) {}  // 0.5초 정지
        }

        for(int i =0; i<5; i++){
            System.out.println("띵");
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}
