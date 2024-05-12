package com.kts.java_practice.thread;

// Thread 클래스로부터 직접 생성 예시
// 소리와 출력이 동시에 발생
public class BeepPrintExample2 {
    public static void main(String[] args){
        Runnable beepTask = new BeepTask();
        Thread thread = new Thread(beepTask);
        thread.start();

        for(int i =0; i<5; i++){
            System.out.println("띵");
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}
