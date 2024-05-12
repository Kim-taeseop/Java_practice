package com.kts.java_practice.thread;

import java.awt.*;

// Thread 하위 클래스로부터 생성 예시
public class BeepThread extends Thread{
    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();  // Tookit 객체 얻기
        for(int i =0; i<5; i++){
            toolkit.beep(); // 비프음 발생
            try { Thread.sleep(500); } catch (Exception e) {}  // 0.5초 정지
        }
    }
}
