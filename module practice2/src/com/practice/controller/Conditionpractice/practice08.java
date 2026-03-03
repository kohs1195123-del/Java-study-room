package com.practice.controller.Conditionpractice;

import java.util.Scanner;

public class practice08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번쨰 양수입력");
        int num1 = sc.nextInt();
        System.out.println("두번쨰 양수입력");
        int num2 = sc.nextInt();
        System.out.println("+,-,*,/,%");
        char op = sc.next().charAt(0);
        
        if (num1<=0 || num2<=0){
            System.out.println("잘못 입력하셨습니다 프로그램을 종료합니다");
        } else {
            int result = 0;   //결과를 담을 바구니 만드느거
            boolean isOpOk = true; //연산자 말이 맞는기 검증

            switch (op) {
                case '+' : result =num1 +num2 ; break;
                case '-' : result =num1 -num2 ; break;
                case '*' : result =num1 *num2 ; break;
                case '/' : result =num1 /num2 ; break;
                case '%' : result =num1 %num2 ; break;
                default:
                    isOpOk = false;
                    break;
            }

            if (isOpOk){
                System.out.println(num1 + ""+ op + " " + num2 + "=" + result);
            }else {
                System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다");
            }
        }
        sc.close();


    }
}
