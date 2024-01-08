package com.kts.java_practice.conditional;

public class switchPractice {
    public static void main(String[] args) {

        int score = (int) (Math.random() * 6) + 1;

        switch (score) {
            case 1:
                System.out.println("1점");
                break;
            case 2:
                System.out.println("2점");
                break;
            case 3:
                System.out.println("3점");
                break;
            case 4:
                System.out.println("4점");
                break;
            case 5:
                System.out.println("5점");
                break;
            default:
                System.out.println("6점");
                break;
        }
    }
}
