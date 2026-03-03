package com.practice.controller.Conditionpractice;

import java.util.Scanner;

public class practice09 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("중간고사 점수 입력 : ");
        int midterm=sc.nextInt();
        System.out.println("기말고사 점수 입력 : ");
        int finalexam = sc.nextInt();
        System.out.println("과제 점수 입력 : ");
        int assignment = sc.nextInt();
        System.out.println("출석 횟수 입력 : ");
        int attendanceCount = sc.nextInt();

        double midcalc = midterm*0.2;
        double finalcalc = midterm*0.3;
        double assignmentcalc = midterm*0.3;
        double attendancecalc = (double) attendanceCount;

        double totalscore = midcalc+finalcalc+assignmentcalc+attendancecalc;

        String result = (totalscore >= 70 && attendancecalc >=14)? "pass" : "Fail" ;

        System.out.println("====결과====");
        System.out.printf("중간 고사 점수 : %.1f\n ", + midcalc);   //printf 쓰는거 공부해야함 도움 많이 된다
        System.out.printf("기말 고사 점수 : %.1f\n ", + finalcalc);
        System.out.printf("과제  점수 : %.1f\n ", + assignmentcalc);
        System.out.printf("출석 점수 : %.1f\n ", + attendancecalc);
        System.out.printf("총점 : %.1f\n", totalscore);
        System.out.println(result);

        sc.close();

    }
}
