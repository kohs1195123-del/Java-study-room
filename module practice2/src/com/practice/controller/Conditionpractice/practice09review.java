package com.practice.controller.Conditionpractice;

import java.util.Scanner;

public class practice09review {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("증긴고사 점수 입력 : ");
        int mid = sc.nextInt();
        System.out.println("기말고사 점수 입략 : ");
        int Final = sc.nextInt();
        System.out.println("과제 점수 입략 : ");
        int subject = sc.nextInt();
        System.out.println(" 출석횟수 입략 : ");
        int op = sc.nextInt();

        double midcacl = mid * 0.2;
        double finalcacl = mid * 0.3;
        double subjectcacl = mid * 0.3;
        double opcacl = (double) op;
        double total = midcacl + finalcacl + subjectcacl + opcacl;

        String result = (total >= 70 && op >= 14) ? "pass" : "fail";

        System.out.println("===결과====");
        System.out.printf("중간 고사 점수(20) : ", +midcacl);
        System.out.printf("기말 고사 점수(30) : ", +finalcacl);
        System.out.printf("과제 점수(30) : ", +subjectcacl);
        System.out.printf("출석 점수(20) : ", +opcacl);
        System.out.printf("총점 : ", +total);
        System.out.println(result);

        sc.close();
    }
}
