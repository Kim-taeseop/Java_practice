package com.kts.java_practice.apiPractice;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DatePractice {
    public static void main(String[] args){
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
        String strNow = sdf.format(now);

        System.out.println(now);
        System.out.println(strNow);

        System.out.println("===== 번외 Local쓰는 클래스 차이 ======");
        LocalDate now1 = LocalDate.now();
        LocalTime now2 = LocalTime.now();
        LocalDateTime now3 = LocalDateTime.now();
        System.out.println("LocalDate : " + now1);
        System.out.println("LocalTime : " + now2);
        System.out.println("LocalDateTime : " + now3);
    }
}
