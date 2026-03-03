package com.practice.controller.Conditionpractice;

import java.util.Scanner;

public class practice06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("등급을 입력하시오(관리자,회원,비회원");
        String grade = sc.next();

        if (grade.equals("관리자")){
            System.out.println("회원관리,게시글관리,게시글작성,게시글조회,댓글작성");
        } else if (grade.equals("회원")) {
            System.out.println("게시글 작성,게시글조회,댓글작성");
        } else if (grade.equals("비회원")) {

        } else {
            System.out.println("잘못 입력했습니다");
        }
        sc.close();


    }
}
