package com.sotogito.homework.view;

import com.sotogito.homework.controller.Function;
import com.sotogito.homework.run.Application;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    Function function = new Function();

    public void displayMenu() {
        String menuPrintout = "%d. %s\n";

        while (true) {
            System.out.println();
            System.out.printf(menuPrintout, 1, "간단 계산기");
            System.out.printf(menuPrintout, 2, "작은 수에서 큰 수까지 합계");
            System.out.printf(menuPrintout, 3, "신상 정보 확인");
            System.out.printf(menuPrintout, 4, "학생 정보 확인");
            System.out.printf(menuPrintout, 5, "별과 숫자 출력");
            System.out.printf(menuPrintout, 6, "난수까지의 합계");
            System.out.printf(menuPrintout, 7, "구구단");
            System.out.printf(menuPrintout, 8, "주사위 숫자 알아맞추기 게임");
            System.out.printf(menuPrintout, 9, "프로그램 종료");

            System.out.print("메뉴 번호 : ");
            int functionNum = sc.nextInt();

            if(functionNum == 9){
                break;
            }
            switch (functionNum) {
                case 1:
                    function.calculator();
                    break;
                case 2:
                    function.totalCalculator();
                    break;
                case 3:
                    function.printProfile();
                    break;
                case 4:
                    function.printScore();
                    break;
                case 5:
                    function.printStarNumber();
                    break;
                case 6:
                    function.sumRandom();
                    break;
                case 7:
                    function.exceptGugu();
                    break;
                case 8:
                    function.diceGame();
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.\n");
            }
        }
    }
}
