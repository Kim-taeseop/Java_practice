package com.kts.java_practice.reference;

// 배열
public class ArrayPractice {
    public static void main(String[] args) {
        int[] testArray1 = {1,2,3};  // 배열 생성
        testArray1[1] = 3;  // 인덱스 1번의 값을 3으로 변경

        // 값을 나중에 결정
        int[] testArray2 = null;
        testArray2 = new int[] {1,2,3};

        // 미리 만들어 놓는 배열
        int[] testArray3 = new int[3]; // 현재 모든 값이 0으로 초기화 (문자열은 null)
        // 이후 값 설정
        testArray3[0] = 1;
        testArray3[1] = 2;
        testArray3[2] = 3;
    }
}
