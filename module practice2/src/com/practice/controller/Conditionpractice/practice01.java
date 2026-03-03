package com.practice.controller.Conditionpractice;

import java.util.Scanner;

public class practice01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.수정");
        System.out.println("2.조회");
        System.out.println("3.삭제");
        System.out.println("4.종료");

        System.out.println("메뉴 번호를 입력하세요 : ");
        int menu = sc.nextInt();

        switch (menu) {
            case 1 :
                System.out.println("수정 메뉴입니다");
                break;
            case 2 :
                System.out.println("조회 메뉴입니다");
                break;
            case 3 :
                System.out.println("식제 메뉴입니다");
                break;
            case 4 :
                System.out.println("종료 메뉴입니다");
                break;
            default:
                System.out.println("프로그램이 종료됩니다.");
                break;
        }
        sc.close();


    }
}
