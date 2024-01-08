package com.kts.java_practice.conditional;

public class ifPractice {
    public static  void main(String[] args) {

        int score = 95; // 해당 값은 A
        score = 85; // 해당 값은 B
        score = 75; // 해당 값은 C

        if (score >= 90) {
            System.out.println("A");
        } else if(90 > score && score >= 80){
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
}
