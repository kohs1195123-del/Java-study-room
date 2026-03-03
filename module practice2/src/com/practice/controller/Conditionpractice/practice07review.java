package com.practice.controller.Conditionpractice;

import java.util.Scanner;

public class practice07review {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("키(m)를 입력해주세여");
        double height = sc.nextDouble();
        System.out.println("몸무게(kg)를 입력해주세여");
        double weight = sc.nextDouble();
        double bmi = weight/(height*height);

        String result = "";

        if (bmi < 18.5){
            result = "저체중";
        } else if (bmi <23){
            result = "정상체중";
        } else if (bmi < 25){
            result = "과체중";
        } else if (bmi < 30){
            result = "비만";
        } else {
            result = "고도비만";
        }
        System.out.println("당신의 bmi : " + result + "입니다");
        sc.close();

    }
}
