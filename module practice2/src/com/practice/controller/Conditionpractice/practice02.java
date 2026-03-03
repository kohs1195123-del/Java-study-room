package com.practice.controller.Conditionpractice;

import java.util.Scanner;

public class practice02 { //클래스 선언
    public static void main(String[] args) { // 프로그렘 시작대는 시작점
        Scanner sc = new Scanner(System.in);  // 키보드로 치기위해 입력 받아낼 도구sc

        System.out.println("정수를 하나 입력하세요 : "); // 이게 사용자에게 머라고 질문 나오게 할지 하는거
        int num = sc.nextInt();//이게 sc.nextInt() 이게 num이라는 정수를 가져온다는 뜻

        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("짝수다");
            } else {
                System.out.println("홀수다");
            }


        } else {
            System.out.println("양수만 입력해 주세요");

        }
        sc.close();
    }

}
