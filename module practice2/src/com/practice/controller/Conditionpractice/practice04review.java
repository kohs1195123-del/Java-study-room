package com.practice.controller.Conditionpractice;

import java.util.Scanner;

public class practice04review {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1~12 사이의 정수를 입력하시오");
        int month = sc.nextInt();

        String season = "";
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "가을";
                break;
            case 3:
            case 4:
            case 5:
                season = "봄";
                break;
            case 6:
            case 7:
            case 8:
                season = "여름";
                break;
            case 9:
            case 10:
            case 11:
                season = "가울";
                break;
            default:
                season = "잘못 입력된 달";
                break;
        }
        System.out.println(month + "월은" + season + "입니다");
    sc.close();


    }
}





