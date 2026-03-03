package com.practice.controller.Conditionpractice;

import java.util.Scanner;

public class practice05review {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String saveID = "rhtjdals";
        String savePW = "rhtjdals1";

        System.out.println("아이디를 입력하시오");
        String inputID = sc.next();
        System.out.println("비밀번호를 입력하시오");
        String inputPW = sc.next();

        if (saveID.equals(inputID)) {
            if (savePW.equals(inputPW)) {
                System.out.println("로그인 성공");
            } else {
                System.out.println("비밀번호가 틀렸습니다");
            }
        }else {
            System.out.println("아이디가 틀렸습니다");
        }
        sc.close();
    }
}