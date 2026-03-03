package com.practice.controller.Conditionpractice;

import java.util.Scanner;

public class practice03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("국어 점수를 입력하시어 : ");
        int kor = sc.nextInt();
        System.out.println("영어 점수를 입력하시어 : ");
        int eng = sc.nextInt();
        System.out.println("수학 점수를 입력하시어 : ");
        int math = sc.nextInt();

        int sum = kor + eng + math;
        double avg = sum/3.0; // 소수점까지 구하기위해

        if (kor>=40 && eng >=40 && math>=40 && avg>=60) {


            System.out.println("---합격 결과 ---");
            System.out.println("국어 : " + kor);
            System.out.println("영어 : " + eng);
            System.out.println("수학 : " + math);
            System.out.println("합계 : " + sum);
            System.out.printf("평균 : %.1f\n", + avg);
            System.out.println("축하합니다, 합격입니다");

        } else {
            System.out.println("불합격입니다");
        }

        sc.close();

    }

}
