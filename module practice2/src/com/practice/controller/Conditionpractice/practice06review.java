package com.practice.controller.Conditionpractice;

import java.util.Scanner;

public class practice06review {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("등급을 입력하세요(관리자,회원,비회원)");
        String grade = sc.next();

        switch (grade) {
            case "관리자" :
                System.out.println(" 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
            case "회원" :
                System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
            case "비회원" :
                System.out.println("게시글 조회");
                break;
            default:
                System.out.println("잘못 입력했습니다");}
        sc.close();




        }
    }
