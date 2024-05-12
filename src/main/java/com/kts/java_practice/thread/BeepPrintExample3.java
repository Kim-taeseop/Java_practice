package com.kts.java_practice.thread;

// Thread 하위 클래스로부터 생성 예시

public class BeepPrintExample3 {
    public static void main(String[] args){
        Thread thread = new BeepThread();
        thread.start();

        for(int i =0; i<5; i++){
            System.out.println("띵");
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}
