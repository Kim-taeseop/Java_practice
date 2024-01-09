package com.kts.java_practice.reference;

//배열 복사
public class ArrayCopyPractice {
    public static void main(String[] args) {

        // for문 사용
        int[] testArray = {1,2,3};
        int[] newArray = new int[5];
        int[] newArray2 = new int[6];

        for (int i =0; i<testArray.length; i++){
            newArray[i] = testArray[i];
        }

        for (int i =0; i<newArray.length; i++){
            System.out.println(newArray[i] + ", ");
        }

        // System.arraycopy 사용
        System.arraycopy(testArray, 0, newArray2, 0, 3);

        for (int i =0; i<newArray2.length; i++){
            System.out.println(newArray2[i] + ", ");
        }
    }
}
