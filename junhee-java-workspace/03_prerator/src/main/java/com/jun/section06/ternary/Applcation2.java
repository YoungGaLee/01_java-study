package com.jun.section06.ternary;

public class Applcation2 {
    public static void main(String[] args) {
        // 특정 정수값이 짝수인지 홀수인지 판별 후 출력
        // 짝수일 경우 "짝수이다", 그게 아니면 "홀수이다"

        int num = 10;

//        String result = (num % 2 == 0) ? "짝수이다" : "홀수이다";
        String result = (num % 2 == 1) ? "홀수이다" : "짝수이다";

        System.out.println(result);


    }
}
