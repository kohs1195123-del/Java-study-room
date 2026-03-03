package com.practice.controller.Conditionpractice;

import java.util.Scanner;

public class practice07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("키(cm)를 입력해 주세여");
        double height = sc.nextDouble();

        System.out.println("몸무게(kg)를 입력해 주세여");
        double weight = sc.nextDouble();

        double BMI = weight / (height * height);
        System.out.println("당신의 BMI 지수는" + BMI + "입니다");

        String result = "";

        if (BMI < 18.5) {
            result = "저체중";  // sout 안쓰고 result 로 쓰면 코드줄일줏있음
        } else if (BMI < 23) {
            result = "정상체중";
        } else if (BMI < 25) {
            result = "과체중";
        } else if (BMI < 30) {
            result = "비만";
        } else {
            result = "고도 비만";
        }
        System.out.println("판별 결과 : " + result);
        sc.close();

    }
}



