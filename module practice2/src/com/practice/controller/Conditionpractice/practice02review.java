package com.practice.controller.Conditionpractice;

import java.util.Scanner;

public class practice02review {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 하나 입력하세여 : ");
        int num = sc.nextInt();

        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("짝수다");
            } else {
                System.out.println("홀수다");
            }
        }else{
                System.out.println("양수만 입력해주세요");
            }
            sc.close();

        }
    }
