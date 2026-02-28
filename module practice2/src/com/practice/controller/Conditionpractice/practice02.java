package com.practice.controller.Conditionpractice;

import java.util.Scanner;

public class practice02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력해");
        int num = sc.nextInt();

        if (num>0&& num%2==0){
            System.out.println("짝숟다");
        } else if ( num<0){
            System.out.println("양수만 입력해주세요");
        }




    }
}
