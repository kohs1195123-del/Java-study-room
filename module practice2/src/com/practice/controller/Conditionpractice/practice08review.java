package com.practice.controller.Conditionpractice;

import java.util.Scanner;

public class practice08review {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번쨰 양수를 입력하세여");
        int num1 = sc.nextInt();
        System.out.println("두번쨰 양수를 입력하세여");
        int num2 = sc.nextInt();
        System.out.println("+,-,*,/,%");
        char op = sc.next().charAt(0);

        if (num1<=0|| num2<=0){
            System.out.println("잘못입력하셨습니다. 프로그램을 종료합니다");
        }else {
            int result = 0;
            boolean isOpok = true;
            switch (op){
                case '+' : result = num1+num2; break;
                case '-' : result = num1-num2; break;
                case '*' : result = num1*num2; break;
                case '/' : result = num1/num2; break;
                case '%' : result = num1%num2; break;
                default:
                    isOpok = false;
                    break;
            } if (isOpok) {
                System.out.println(num1 + " " + op + " " + num2 + " = " + result);
            }
            sc.close();
        }


    }
}
