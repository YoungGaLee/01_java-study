package com.ibe6.section06.ternary;

public class Application3 {
    public static void main(String[] args) {
        //특정 종료의사값(y/n)을 가지고 판별해서 출력
        // 종료의사값이 대소문자 구별없이 y일 경우 "프로그램을 종료합니다",
        //                        그게 아닐 경우 "계속 진행하겠습니다" 출력
        char ch = 3;

        String result = (ch == 'y' || ch == 'Y') ? "프로그램을 종료합니다" : "계속 진행하겠습니다";
        System.out.println(result);
    }
}
